<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"

    tools:context=".ui.home.HomeFragment"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/colorPrimaryDark">





    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent"


        android:layout_marginBottom="?attr/actionBarSize"
        android:background="@color/colorPrimaryDark"
       >

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginBottom="35dp"
            android:orientation="vertical">

            <LinearLayout
                android:id="@+id/information_necesaire"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_marginLeft="17dp"
                android:layout_marginTop="25dp"
                android:layout_marginRight="17dp"
                android:layout_marginBottom="5dp"
                android:background="@drawable/custom_layout"
                android:gravity="center"
                android:orientation="vertical"
                android:padding="10dp">

                <TextView
                    android:id="@+id/besoinEnergitique2"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center"
                    android:layout_marginTop="25dp"
                    android:layout_weight="1"
                    android:gravity="center"
                    android:text="Votre besoinEnergitique"
                    android:textColor="@color/bleu_gris_fonçe"
                    android:textColorHint="@color/bleu_gris_fonçe"
                    android:textSize="24sp" />

                <TextView
                    android:id="@+id/textView10"
                    android:layout_width="mat