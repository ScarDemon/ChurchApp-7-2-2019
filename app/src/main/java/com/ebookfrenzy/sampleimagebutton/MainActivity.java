package com.ebookfrenzy.sampleimagebutton;

import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
// import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.ViewGroup;
import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import androidx.navigation.*;
import android.support.design.widget.NavigationView;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.AppBarConfiguration.Builder;
import android.support.v4.widget.DrawerLayout;




public class MainActivity extends AppCompatActivity implements secondFragment.
        OnFragmentInteractionListener, firstStationPage.OnFragmentInteractionListener,
        thridFragment.OnFragmentInteractionListener, fourthFragment.OnFragmentInteractionListener,
        openingPrayerFragment.OnFragmentInteractionListener,
        LiturgyoftheHours.OnFragmentInteractionListener, ConfessPage.OnFragmentInteractionListener,
        LordPrayerPage.OnFragmentInteractionListener, QaumoPage.OnFragmentInteractionListener,
        InitialPrayersPage.OnFragmentInteractionListener, HailMaryPage.OnFragmentInteractionListener,
        EnglishOrMalRosaryPage.OnFragmentInteractionListener, MalaylamRosaryPage.OnFragmentInteractionListener,
        SignOfCrossPage.OnFragmentInteractionListener, ApostlesCreedPage.OnFragmentInteractionListener,
        MysteriesPage.OnFragmentInteractionListener, LitanyPage.OnFragmentInteractionListener,
        HailHolyQueenPage.OnFragmentInteractionListener, MemorarePage.OnFragmentInteractionListener,
        JoyfulMysteryPage.OnFragmentInteractionListener, SorrowfulMysteryPage.OnFragmentInteractionListener,
        LuminousMysteriesPage.OnFragmentInteractionListener, GloriousMysteriesPage.OnFragmentInteractionListener,
        GloryBePage.OnFragmentInteractionListener, TheAnnuciationPage.OnFragmentInteractionListener, TheVisitationPage.OnFragmentInteractionListener,
        TheNavitiyPage.OnFragmentInteractionListener, ThePresenationPage.OnFragmentInteractionListener,
        JesusChildPage.OnFragmentInteractionListener, TheBaptismPage.OnFragmentInteractionListener, TheManifestationPage.OnFragmentInteractionListener,
        TheProclamationPage.OnFragmentInteractionListener, TheTransPage.OnFragmentInteractionListener,
        TheEucharistPage.OnFragmentInteractionListener, TheResurrectionPage.OnFragmentInteractionListener,
        TheAscensionPage.OnFragmentInteractionListener, TheDescentPage.OnFragmentInteractionListener,
        TheAssumptionPage.OnFragmentInteractionListener, TheCoronationPage.OnFragmentInteractionListener,
        TheAgonyPage.OnFragmentInteractionListener, TheSPillarPage.OnFragmentInteractionListener,
        TheCThorns.OnFragmentInteractionListener, TheCarryCrossPage.OnFragmentInteractionListener,
        TheCrucifixationPage.OnFragmentInteractionListener, PreparationPage.OnFragmentInteractionListener,
        Examination_Conscience_Page.OnFragmentInteractionListener, Maw_Prayer_Page.OnFragmentInteractionListener,
        Prayer_Repentance_Page.OnFragmentInteractionListener, Act_Of_Contrition_Page.OnFragmentInteractionListener,
        ThanksGiving_Confess_Page.OnFragmentInteractionListener, Prayer_To_Holy_Spirit_Page.OnFragmentInteractionListener,
        FirstCommandmentPage.OnFragmentInteractionListener, TheSecondCommandmentPage.OnFragmentInteractionListener,
        TheThirdCommandmentPage.OnFragmentInteractionListener, TheFourthCommandment_Children_Page.OnFragmentInteractionListener,
        TheFourthCommandment_Parent_Page.OnFragmentInteractionListener, TheFifthCommandmentPage.OnFragmentInteractionListener,
        SixthAndNinthCommandmentPage.OnFragmentInteractionListener, SixthAndNinthCommandment_Married_People_Page.OnFragmentInteractionListener,
        TheSeventhAndTenthCommandmentsPAge.OnFragmentInteractionListener, TheEighthCommandmentPage.OnFragmentInteractionListener,
        PrepPrayerStationPage.OnFragmentInteractionListener, RealFirstStationPage.OnFragmentInteractionListener,
        SecondStationPage.OnFragmentInteractionListener, ThirdStationPage.OnFragmentInteractionListener,
        FourthStationPage.OnFragmentInteractionListener, FifthStationPage.OnFragmentInteractionListener,
        SixthStationPage.OnFragmentInteractionListener, SeventhStationPage.OnFragmentInteractionListener,
        EighthStationPage.OnFragmentInteractionListener, NinthStationPage.OnFragmentInteractionListener,
        TenthStationPage.OnFragmentInteractionListener, TheEleventhStationPage.OnFragmentInteractionListener,
        TwelfthStationPage.OnFragmentInteractionListener, ThirteenthStationPage.OnFragmentInteractionListener,
        FourteenthStationPage.OnFragmentInteractionListener, LitEnglishMalPage.OnFragmentInteractionListener,
        EnglishOrMalConfessPage.OnFragmentInteractionListener




{

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.container);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        

        }

        public boolean onOptionsSelected (MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onContextItemSelected(item);
        }

        public void onFragmentInteraction(Uri uri) {


        }
    public void linkToWebsite(View view) {
        Intent link = new Intent(Intent.ACTION_VIEW);
        link.setData(Uri.parse("https://stthomascatholic.church"));
        startActivity(link);
    }


}



