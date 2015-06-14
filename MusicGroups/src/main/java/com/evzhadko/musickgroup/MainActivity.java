package com.evzhadko.musickgroup;


import android.app.Activity;
import android.support.v4.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Toast;

import com.mikepenz.iconics.typeface.FontAwesome;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.Badgeable;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.Nameable;

import com.evzhadko.musickgroup.ScreenOne;
import com.evzhadko.musickgroup.ScreenTwo;



import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ActionBarActivity {

    private Drawer.Result drawerResult = null;

    public List<GroupList> GroupList_data = new ArrayList<GroupList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //http://habrahabr.ru/post/250765/
        //http://habrahabr.ru/post/259429/

        // Инициализируем Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        /***
         *  заполняем массив групп
         */

        GroupList_data.add(new GroupList(R.drawable.exclusive_music,"#AA7CFF66","exclusive_music","EXCLUSIVE MUSIC",""));
        GroupList_data.add(new GroupList(R.drawable.exclusive_muzic,"#AA7CFF66","exclusive_muzic","Новинки Музыки 2015 и Лучшая Музыка",""));
        GroupList_data.add(new GroupList(R.drawable.topmelody,"#AA7CFF66","topmelody","Музыка",""));
        GroupList_data.add(new GroupList(R.drawable.indie_music,"#AA7CFF66","indie_music","Indie Music",""));
        GroupList_data.add(new GroupList(R.drawable.music,"#AA7CFF66","music","Музыка",""));
        GroupList_data.add(new GroupList(R.drawable.pmpage,"#AA7CFF66","pmpage","Perception of music",""));
        GroupList_data.add(new GroupList(R.drawable.nomuzlife,"#AA7CFF66","nomuzlife","Новая Музыка [No Music-No Life]",""));
        GroupList_data.add(new GroupList(R.drawable.another_muz,"#AA7CFF66","another_muz","Другая музыка",""));
        GroupList_data.add(new GroupList(R.drawable.viplounge,"#AA7CFF66","viplounge","Lounge Music Lifestyle　Chillout Jazz Nu Disco",""));
        GroupList_data.add(new GroupList(R.drawable.dutchhouse,"#AA7CFF66","dutchhouse","Dutch House Music",""));
        GroupList_data.add(new GroupList(R.drawable.myfavoritesister,"#AA7CFF66","myfavoritesister","AlteR |Music / Films etc.|",""));
        //GroupList_data.add(new GroupList(R.drawable.newalbums,"#AA7CFF66","newalbums","Новые Альбомы",""));
        GroupList_data.add(new GroupList(R.drawable.bbcradio1,"#AA7CFF66","bbcradio1","BBC Radio 1 / 1Xtra",""));

        /***
         *  заполняем массив групп
         */




        Resources res = getResources();

        // Инициализируем Navigation Drawer
        drawerResult = new Drawer()
                .withActivity(this)
                .withToolbar(toolbar)
                .withActionBarDrawerToggle(true)
                .withHeader(R.layout.drawer_header)
                //.addDrawerItems(new PrimaryDrawerItem().)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName(GroupList_data.get(0).GroupName.toString()).withIcon(getResources().getDrawable(GroupList_data.get(0).GroupIcon)).withIdentifier(1),
                        new PrimaryDrawerItem().withName(GroupList_data.get(1).GroupName.toString()).withIcon(getResources().getDrawable(GroupList_data.get(1).GroupIcon)).withIdentifier(1),
                        new PrimaryDrawerItem().withName(GroupList_data.get(2).GroupName.toString()).withIcon(getResources().getDrawable(GroupList_data.get(2).GroupIcon)).withIdentifier(1),
                        new PrimaryDrawerItem().withName(GroupList_data.get(3).GroupName.toString()).withIcon(getResources().getDrawable(GroupList_data.get(3).GroupIcon)).withIdentifier(1),
                        new PrimaryDrawerItem().withName(GroupList_data.get(4).GroupName.toString()).withIcon(getResources().getDrawable(GroupList_data.get(4).GroupIcon)).withIdentifier(1),
                        new PrimaryDrawerItem().withName(GroupList_data.get(5).GroupName.toString()).withIcon(getResources().getDrawable(GroupList_data.get(5).GroupIcon)).withIdentifier(1),
                        new PrimaryDrawerItem().withName(GroupList_data.get(6).GroupName.toString()).withIcon(getResources().getDrawable(GroupList_data.get(6).GroupIcon)).withIdentifier(1),
                        new PrimaryDrawerItem().withName(GroupList_data.get(7).GroupName.toString()).withIcon(getResources().getDrawable(GroupList_data.get(7).GroupIcon)).withIdentifier(1),
                        new PrimaryDrawerItem().withName(GroupList_data.get(8).GroupName.toString()).withIcon(getResources().getDrawable(GroupList_data.get(8).GroupIcon)).withIdentifier(1),
                        new PrimaryDrawerItem().withName(GroupList_data.get(9).GroupName.toString()).withIcon(getResources().getDrawable(GroupList_data.get(9).GroupIcon)).withIdentifier(1),
                        new PrimaryDrawerItem().withName(GroupList_data.get(10).GroupName.toString()).withIcon(getResources().getDrawable(GroupList_data.get(10).GroupIcon)).withIdentifier(1),
                        new PrimaryDrawerItem().withName(GroupList_data.get(11).GroupName.toString()).withIcon(getResources().getDrawable(GroupList_data.get(11).GroupIcon)).withIdentifier(1),
                        //new PrimaryDrawerItem().withName(GroupList_data.get(12).GroupName.toString()).withIcon(res.getDrawable(GroupList_data.get(12).GroupIcon)).withIdentifier(1),
                        new DividerDrawerItem(),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_favorites).withIcon(FontAwesome.Icon.faw_heartbeat).withIdentifier(1),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_settings).withIcon(FontAwesome.Icon.faw_cog).withIdentifier(1)


                        /*
                        new PrimaryDrawerItem().withName(R.string.drawer_item_home).withIcon(FontAwesome.Icon.faw_home).withBadge("99").withIdentifier(1),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_free_play).withIcon(FontAwesome.Icon.faw_gamepad),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_custom).withIcon(FontAwesome.Icon.faw_eye).withBadge("6").withIdentifier(2),
                        new SectionDrawerItem().withName(R.string.drawer_item_settings),
                        new SecondaryDrawerItem().withName(R.string.drawer_item_help).withIcon(FontAwesome.Icon.faw_cog),
                        new SecondaryDrawerItem().withName(R.string.drawer_item_open_source).withIcon(FontAwesome.Icon.faw_question).setEnabled(false),
                        new DividerDrawerItem(),
                        new SecondaryDrawerItem().withName(R.string.drawer_item_contact).withIcon(FontAwesome.Icon.faw_github).withBadge("12+").withIdentifier(1)
                        */
                )
                /*
                  .withOnDrawerListener(new Drawer.OnDrawerListener() {
                    @Override
                    public void onDrawerOpened(View drawerView) {
                        // Скрываем клавиатуру при открытии Navigation Drawer
                        InputMethodManager inputMethodManager = (InputMethodManager) MainActivity.this.getSystemService(Activity.INPUT_METHOD_SERVICE);
                        inputMethodManager.hideSoftInputFromWindow(MainActivity.this.getCurrentFocus().getWindowToken(), 0);
                    }

                    @Override
                    public void onDrawerClosed(View drawerView) {
                    }
                })
                 */
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    // Обработка клика
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id, IDrawerItem drawerItem) {
                        Log.d("test", "Нажал на меню и вывалился наъ");

                        if (drawerItem instanceof Nameable) {
                            //Nameable nameable = (Nameable) drawerItem;
                            //Toast.makeText(MainActivity.this, MainActivity.this.getString(((Nameable) drawerItem).getNameRes()), Toast.LENGTH_SHORT).show();
                            Toast.makeText(MainActivity.this, ((Nameable) drawerItem).getName(), Toast.LENGTH_SHORT).show();
                        }
                        if (drawerItem instanceof Badgeable) {
                            Badgeable badgeable = (Badgeable) drawerItem;
                            if (badgeable.getBadge() != null) {
                                // учтите, не делайте так, если ваш бейдж содержит символ "+"
                                try {
                                    int badge = Integer.valueOf(badgeable.getBadge());
                                    if (badge > 0) {
                                        drawerResult.updateBadge(String.valueOf(badge - 1), position);
                                    }
                                } catch (Exception e) {
                                    Log.d("test", "Не нажимайте на бейдж, содержащий плюс! :)");
                                }
                            }
                        }


                        Fragment fragment = null;

                        fragment = new ScreenOne();


                        // Insert the fragment by replacing any existing fragment
                        if (fragment != null) {
                            FragmentManager fragmentManager = getSupportFragmentManager();
                            fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
                            Log.e(this.getClass().getName(), "Fragment is created");
                            // Highlight the selected item, update the title, and close the drawer
                            //mDrawerList.setItemChecked(position, true);
                            //setTitle(mScreenTitles[position]);
                            //mDrawerLayout.closeDrawer(mDrawerList);
                        } else {
                            // Error
                            Log.e(this.getClass().getName(), "Error. Fragment is not created");
                        }


                    }
                })
                .withOnDrawerItemLongClickListener(new Drawer.OnDrawerItemLongClickListener() {
                    @Override
                    // Обработка длинного клика, например, только для SecondaryDrawerItem
                    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id, IDrawerItem drawerItem) {
                        if (drawerItem instanceof SecondaryDrawerItem) {
                            Toast.makeText(MainActivity.this, MainActivity.this.getString(((SecondaryDrawerItem) drawerItem).getNameRes()), Toast.LENGTH_SHORT).show();

                        }
                        return false;
                    }
                })
                                .build();
    }

    @Override
    public void onBackPressed() {
        // Закрываем Navigation Drawer по нажатию системной кнопки "Назад" если он открыт
        if (drawerResult.isDrawerOpen()) {
            drawerResult.closeDrawer();
        } else {
            super.onBackPressed();
        }
    }

    // Заглушка, работа с меню
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // Заглушка, работа с меню
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
