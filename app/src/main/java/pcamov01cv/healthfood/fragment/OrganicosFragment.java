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


public class OrganicosFragment extends Fragment {


    public OrganicosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_organicos, container, false);
        showToolbar(getResources().getString(R.string.bar_organicos), false, view);

        RecyclerView productoRecycler = (RecyclerView) view.findViewById(R.id.organicosRecycler);
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
        producto.add(new Producto("Lasagna Tofú", "Pasta vegetariana exquisita y saludable.", "24.5000", "https://encolombia.com/wp-content/uploads/2012/12/Lasagna-de-Tofu-recetas.jpg?6a0035", "David Gomez: recomendable"));
        producto.add(new Producto("Macarroni a la Siciliana", "Macarronis rellenos de berenjenas ", "25.200", "https://encolombia.com/wp-content/uploads/2012/12/Macarroni-a-la-Siciliana-recetas.jpg?6a0035", "David Gomez: recomendable"));
        producto.add(new Producto("Tortilla de Acelgas", "Rica tortilla de acelgas", "$14.300", "https://encolombia.com/wp-content/uploads/2012/12/Tortilla-de-Acelgas-recetas.jpg?6a0035", "Laura Lopez: recomendable"));
        producto.add(new Producto("Tomates Rellenos de Maíz y Queso", "Ricos tomates rellenos de maíz suave y queso mozzarella", "$53.500", "https://encolombia.com/wp-content/uploads/2012/12/Tomates-Rellenos-de-Maiz-y-Queso-recetas.jpg?6a0035", "Angie Perez: recomendable"));
        producto.add(new Producto("Pasta con Verduras", "Pastas con verduras a la crema con un toque de pequeños champiniones", "$48.000", "https://encolombia.com/wp-content/uploads/2012/12/Pastas-con-Verduras-a-la-Crema-recetas.jpg?6a0035", "Daniela Acosta: recomendable"));

        return producto;
    }

    public void showToolbar(String tittle, boolean upButton, View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);


    }
}