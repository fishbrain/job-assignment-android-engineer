package com.fishbrain.assignment.presenter;

import android.test.AndroidTestCase;

import com.fishbrain.android.event.CatchesEvent;
import com.fishbrain.android.domain.Catch;
import com.fishbrain.android.network.interactor.CatchesInteractor;
import com.fishbrain.assignment.viewcallbacks.CatchesFragmentViewCallbacks;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by dimitris.lachanas on 23/08/15.
 */
public class CatchesPresenterTest extends AndroidTestCase {

    public static final String sType = "type";
    public static final String sDescription = "description";
    CatchesFragmentViewCallbacks catchesFragmentViewCallbacks;
    CatchesInteractor catchesInteractor;
    CatchesPresenterImpl catchesPresenter;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        catchesFragmentViewCallbacks = mock(CatchesFragmentViewCallbacks.class);
        catchesInteractor = mock(CatchesInteractor.class);
        catchesPresenter = new CatchesPresenterImpl(catchesInteractor, catchesFragmentViewCallbacks, getContext());
    }


    /**
     * Tests the flow of getCatches after a successful network call
     */
    @Test
    public void testOnCatchesSuccessEvent() {
        List<Catch> expectedResult = getCatches();
        catchesPresenter.onEvent(new CatchesEvent(expectedResult));

        verify(catchesFragmentViewCallbacks).onCatchesFetched(anyList());
    }

    /**
     * Tests the flow of getCatches after a failure
     */
    @Test
    public void testOnCatchesFailEvent() {
        catchesPresenter.onEvent(new CatchesEvent());
        verify(catchesFragmentViewCallbacks).onErrorOccured();
    }

    private List<Catch> getCatches() {

        List<Catch> catches = new ArrayList<>();

        catches.add(getCatch());

        return catches;
    }

    private Catch getCatch() {
        return new Catch(sType, 1, sDescription, java.util.Calendar.getInstance(), 10, 10, java.util.Calendar.getInstance(), null,
                null, null);
    }

    public void tearDown() throws Exception {

    }

}