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


public class HeladeriaFragment extends Fragment {


    public HeladeriaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_heladeria, container, false);
        showToolbar(getResources().getString(R.string.bar_heladeria), false, view);

        RecyclerView productoRecycler = (RecyclerView) view.findViewById(R.id.heladeriaRecycler);
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
        producto.add(new Producto("Himalaya", "Apetitosa combinación de frutas como: uva, fresa, manzana, mango, melón, papayuela, piña, banano.", "4.5000", "http://www.corazondemelon.co/uploads/1/3/0/0/13000130/1877406_orig.png", "Laura Londoño:\n deliciosa."));
        producto.add(new Producto("Banana Split", "Apetitoso copa con banano, durazno, fresa. ", "5.200", "http://www.turronescoppelia.com/s/cc_images/cache_2427387968.jpg?t=1348659104", "Marcela Perez:\n muy pequeña para su precio!"));
        producto.add(new Producto("Monte Kenia", "Super copa de helados con brownie.", "$4.300", "http://www.corazondemelon.co/uploads/1/3/0/0/13000130/4019259_orig.png", "Daniel Lopez:\n el brownie parece viejo"));
        producto.add(new Producto("Sinai", "Deliciosa combinación con finos trozos de fresa y durazno.", "$3.500", "http://www.gelatolina.com/sites/default/files/MELBA.jpg", "David Gomez:\n recomendable"));

        return producto;
    }

    public void showToolbar(String tittle, boolean upButton, View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);


    }
}