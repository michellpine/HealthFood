package pcamov01cv.healthfood.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import pcamov01cv.healthfood.R;
import pcamov01cv.healthfood.adapter.ProductoAdapter;
import pcamov01cv.healthfood.model.Producto;


public class CafeteriaFragment extends Fragment {


    public CafeteriaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cafeteria, container, false);
        showToolbar(getResources().getString(R.string.bar_cafeteria), false, view);

        RecyclerView productoRecycler = (RecyclerView) view.findViewById(R.id.cafeteriaRecycler);
        productoRecycler.setHasFixedSize(true);

        GridLayoutManager recycleLayoutManager;
        recycleLayoutManager = new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false);
        productoRecycler.setLayoutManager(recycleLayoutManager);
        productoRecycler.setItemAnimator(new DefaultItemAnimator());

        ProductoAdapter productoAdapter =
                new ProductoAdapter(buidPictures(), R.layout.cardview_productos, getActivity());
        productoRecycler.setAdapter(productoAdapter);


        return view;
    }


    public ArrayList<Producto> buidPictures() {
        ArrayList<Producto> producto = new ArrayList<>();
        producto.add(new Producto("Empanada Argentina", "", "$3.5000", "http://fondaargentina.com/wp-content/uploads/2014/11/11549.jpg", "Laura Londoño: deliciosa, con muy buena sazón. \n Marcela Perez: demasiada grasa! \n Daniel Lopez: muy buena \n Alejandro Pineda: muy caras para su tamaño \n David Gomez: recomendales" ));
        producto.add(new Producto("Buñuelo", " ", "$1.200", "http://districondorito.com/wp-content/uploads/2016/05/bunuelos-2.jpg", "Marcela Perez: demasiada grasa! \n Daniel Lopez: muy buena \n Alejandro Pineda: muy caras para su tamaño \n David Gomez: recomendales \n Laura Londoño: deliciosa, con muy buena sazón."));
        producto.add(new Producto("Palito de queso", "", "$1.300", "http://www.bellini.cl/img/blog/20151222064406palitos%20de%20queso.jpg", "Daniel Lopez: muy buena \n Marcela Perez: demasiada grasa! \n Alejandro Pineda: muy caras para su tamaño \n David Gomez: recomendales \n Laura Londoño: deliciosa, con muy buena sazón."));
        producto.add(new Producto("Pandequeso", " ", "$1.200", "http://www.mycolombianrecipes.com/wp-content/uploads/2010/06/Pan-de-Queso-Colombiano1.jpg", "Alejandro Pineda: muy caras para su tamaño  \n David Gomez: recomendales \n Laura Londoño: deliciosa, con muy buena sazón."));
        producto.add(new Producto("Pandebono", "", "1.100", "https://www.vvsupremo.com/wp-content/uploads/2015/11/900X570_Pandebono-Columbian-Cheese-Bread-900x570.jpg", "David Gomez: recomendales \n Alejandro Pineda: muy caras para su tamaño  \n Laura Londoño: deliciosa, con muy buena sazón."));
        return producto;
    }

    public void showToolbar(String tittle, boolean upButton, View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);


    }
}