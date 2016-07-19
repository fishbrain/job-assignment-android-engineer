package com.fishbrain.assignment.viewmodels;

import android.test.AndroidTestCase;

import com.fishbrain.android.domain.Avatar;
import com.fishbrain.android.domain.Catch;
import com.fishbrain.android.domain.ImageSize;
import com.fishbrain.android.domain.Owner;
import com.fishbrain.android.domain.Photo;
import com.fishbrain.android.domain.PhotoContainer;
import com.fishbrain.android.domain.Species;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by dimitris.lachanas on 24/08/15.
 */
public class CatchesViewModelTest extends AndroidTestCase {

    final static String sCatchImage = "www.image.com";
    final static String sTitle = "species 10.0 lb 10.0 m";
    final static String sNickname = "nickname";
    final static String sDescription = "description";
    final static String sUserAvatarUrl = "www.avatar.com";
    final static String sSpecies = "species";
    static final String sDateFormat = "yyyy-MM-dd HH:mm";

    @Override
    protected void setUp() throws Exception {
        super.setUp();

    }

    /**
     * Test method that checks if the conversion from {@link Catch} to {@link CatchViewModel} is correct
     */
    @Test
    public void testCatchConversion() {
        Catch c = getCatch();

        CatchesViewModel catchesViewModel1 =  new CatchesViewModel(c, getContext());

        CatchesViewModel catchesViewModel2 =  getCatchViewModel();

        assertEquals(catchesViewModel1.getCatchImage(), catchesViewModel2.getCatchImage());
        assertEquals(catchesViewModel1.getId(), catchesViewModel2.getId());
        assertEquals(catchesViewModel1.getCatchPlace(), catchesViewModel2.getCatchPlace());
        assertEquals(catchesViewModel1.getTitle(), catchesViewModel2.getTitle());
        assertEquals(catchesViewModel1.getUserAvatar(), catchesViewModel2.getUserAvatar());
        assertEquals(catchesViewModel1.getUserNickname(), catchesViewModel2.getUserNickname());
    }

    private CatchesViewModel getCatchViewModel() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sDateFormat);
        String date = simpleDateFormat.format(Calendar.getInstance().getTime());

        return new CatchesViewModel(1, sCatchImage, sTitle, date, sNickname, sDescription, sUserAvatarUrl);
    }

    private Catch getCatch() {
        List<ImageSize> sizeList1 = new ArrayList<>();
        sizeList1.add(new ImageSize(null, sUserAvatarUrl, null, null, null));


        List<ImageSize> sizeList2 = new ArrayList<>();
        sizeList2.add(new ImageSize(null, sCatchImage, null, null, null));
        PhotoContainer photoContainer = new PhotoContainer(new Photo(sizeList2, null));
        List<PhotoContainer> photoContainers = new ArrayList<>();
        photoContainers.add(photoContainer);

        return new Catch(null, 1, sDescription, java.util.Calendar.getInstance(), 10, 10, java.util.Calendar.getInstance(), new Owner
                (sNickname, null, null, null, null, true, true, new Avatar(sizeList1)),
                new Species(null, sSpecies, null, null, null, null), photoContainers);

    }
}