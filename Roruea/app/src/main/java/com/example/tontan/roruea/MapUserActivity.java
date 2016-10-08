package com.example.tontan.roruea;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapUserActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private static final LatLng T3 = new LatLng(13.7065312,100.5039185);
    private static final LatLng T2 = new LatLng(13.709282, 100.506822);
    private static final LatLng N9 = new LatLng(13.752383, 100.488301);
    private static final LatLng N8 = new LatLng(13.746141, 100.490146);
    private static final LatLng N6 = new LatLng(13.739927, 100.498164);
    private static final LatLng N5 = new LatLng(13.738520, 100.504571);
    private static final LatLng N4 = new LatLng(13.732483, 100.511963);
    private static final LatLng N3 = new LatLng(13.728497, 100.513235);
    private static final LatLng N30 = new LatLng(13.842143, 100.490956);
    private static final LatLng N29 = new LatLng(13.832213, 100.493867);
    private static final LatLng N24 = new LatLng(13.812973, 100.513380);
    private static final LatLng N22 = new LatLng(13.806424, 100.518834);
    private static final LatLng N21 = new LatLng(13.798720, 100.517220);
    private static final LatLng N18 = new LatLng(13.787467, 100.508251);
    private static final LatLng N16 = new LatLng(13.781863, 100.501076);
    private static final LatLng N15 = new LatLng(13.771977, 100.500218);
    private static final LatLng N13 = new LatLng(13.763646, 100.494132);
    private static final LatLng N12 = new LatLng(13.763021, 100.490613);
    private static final LatLng N10 = new LatLng(13.755976, 100.486815);
    private static final LatLng N1 = new LatLng(13.723335, 100.513589);
    private static final LatLng CN = new LatLng(13.718973, 100.512795);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_user);
        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {

        MarkerOptions t3 = new MarkerOptions();
        t3.position(T3);
        t3.title("วัดราชสิงขร");
        t3.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(t3);


        MarkerOptions t2 = new MarkerOptions();
        t2.position(T2);
        t2.title("วัดวรจรรยาวาส");
        t2.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(t2);

        MarkerOptions n9 = new MarkerOptions();
        n9.position(N9);
        n9.title("ท่าช้าง");
        n9.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(n9);

        MarkerOptions n8 = new MarkerOptions();
        n8.position(N8);
        n8.title("ท่าเตียน");
        n8.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(n8);

        MarkerOptions n6 = new MarkerOptions();
        n6.position(N6);
        n6.title("สะพานพุทธ");
        n6.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(n6);

        MarkerOptions n5 = new MarkerOptions();
        n5.position(N5);
        n5.title("ราชวงศ์");
        n5.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(n5);

        MarkerOptions n4 = new MarkerOptions();
        n4.position(N4);
        n4.title("กรมเจ้าท่า");
        n4.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(n4);

        MarkerOptions n3 = new MarkerOptions();
        n3.position(N3);
        n3.title("สี่พระยา");
        n3.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(n3);

        MarkerOptions n30 = new MarkerOptions();
        n30.position(N30);
        n30.title("นนทบุรี");
        n30.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(n30);

        MarkerOptions n29 = new MarkerOptions();
        n29.position(N29);
        n29.title("พระราม 5");
        n29.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(n29);

        MarkerOptions n24 = new MarkerOptions();
        n24.position(N24);
        n24.title("พระราม 7");
        n24.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(n24);

        MarkerOptions n22 = new MarkerOptions();
        n22.position(N22);
        n22.title("บางโพ");
        n22.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(n22);

        MarkerOptions n21 = new MarkerOptions();
        n21.position(N21);
        n21.title("เกียกกาย");
        n21.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(n21);

        MarkerOptions n18 = new MarkerOptions();
        n18.position(N18);
        n18.title("พายัพ");
        n18.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(n18);

        MarkerOptions n16 = new MarkerOptions();
        n16.position(N16);
        n16.title("สะพานกรุงธน");
        n16.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(n16);

        MarkerOptions n15 = new MarkerOptions();
        n15.position(N15);
        n15.title("เทเวศร์");
        n15.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(n15);

        MarkerOptions n13 = new MarkerOptions();
        n13.position(N13);
        n13.title("พระอาทิตย์");
        n13.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(n13);

        MarkerOptions n12 = new MarkerOptions();
        n12.position(N12);
        n12.title("พระปิ่นเกล้า");
        n12.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(n12);

        MarkerOptions n10 = new MarkerOptions();
        n10.position(N10);
        n10.title("วังหลัง (พรานนก)");
        n10.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(n10);

        MarkerOptions n1 = new MarkerOptions();
        n1.position(N1);
        n1.title("โอเรียนเท็ล");
        n1.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(n1);

        MarkerOptions cn = new MarkerOptions();
        cn.position(CN);
        cn.title("สาทร (ตากสิน)");
        cn.icon(BitmapDescriptorFactory.fromResource(R.mipmap.map));
        map.addMarker(cn);


        map.moveCamera(CameraUpdateFactory.newLatLngZoom(N8,20));

        map.animateCamera(CameraUpdateFactory.zoomTo(13),2000,null);

    }
}
