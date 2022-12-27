package com.example.demoapptracnghiem;


import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.demoapptracnghiem.congthuc.CongThucFragment;
import com.example.demoapptracnghiem.monhoc.Home2Fragment;
import com.example.demoapptracnghiem.monhoc.TiengAnhFragment;
import com.example.demoapptracnghiem.user.ChangePasswordFragment;
import com.example.demoapptracnghiem.user.MyProfileFragment;
import com.google.android.material.navigation.NavigationView;


    public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

        DrawerLayout mDrawerLayout;
        public NavigationView mNavigationView;
        private ImageView imgAvatar;
        private TextView txtName, txtEmail;

        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            initUi();
            mDrawerLayout = findViewById(R.id.drawer_layout);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
                    R.string.nav_drawer_open, R.string.nav_drawer_close);
            mDrawerLayout.addDrawerListener(toggle);
            toggle.syncState();

            mNavigationView.setNavigationItemSelectedListener(this);
            replaceFragment(new Home2Fragment());
            mNavigationView.getMenu().findItem(R.id.nav_home).setChecked(true);

        }

        private void initUi() {
            mNavigationView = findViewById(R.id.navigation_view);
            imgAvatar = mNavigationView.getHeaderView(0).findViewById(R.id.imvAvatar);
            txtName = mNavigationView.getHeaderView(0).findViewById(R.id.txtName);
            txtEmail = mNavigationView.getHeaderView(0).findViewById(R.id.txtEmail);

        }

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            int id = item.getItemId();
            if(id == R.id.nav_home){
                replaceFragment(new Home2Fragment());
                mNavigationView.getMenu().findItem(R.id.nav_home).setChecked(true);
            }else if (id == R.id.nav_montienganh) {
                replaceFragment(new TiengAnhFragment());
                mNavigationView.getMenu().findItem(R.id.nav_montienganh).setChecked(true);

            }else if (id == R.id.nav_xemdiem) {

            }else if (id == R.id.nav_congthuc) {
                replaceFragment(new CongThucFragment());
                mNavigationView.getMenu().findItem(R.id.nav_congthuc).setChecked(true);
            }else if (id == R.id.nav_sign_out) {

            } else if (id == R.id.nav_my_profile) {
                replaceFragment(new MyProfileFragment());
                mNavigationView.getMenu().findItem(R.id.nav_my_profile).setChecked(true);
            }else if (id == R.id.nav_change_password) {
                replaceFragment(new ChangePasswordFragment());
                mNavigationView.getMenu().findItem(R.id.nav_change_password).setChecked(true);
            }
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }

        private void replaceFragment(Fragment fragment) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.content_frame, fragment);
            transaction.commit();
        }
}