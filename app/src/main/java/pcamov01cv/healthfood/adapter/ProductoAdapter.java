package pcamov01cv.healthfood.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import pcamov01cv.healthfood.R;
import pcamov01cv.healthfood.model.Producto;
import pcamov01cv.healthfood.view.ProductoDetalleActivity;


public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.ProductViewHolder> {

    private ArrayList<Producto> productos;
    private int resource;
    private Activity activity;
    private ArrayList<Boolean> itemChecked1;

    public ProductoAdapter(ArrayList<Producto> pictures, int resource, Activity activity) {
        this.productos = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ProductViewHolder holder, final int position) {
        final Producto producto = productos.get(position);
        holder.nombre.setText(producto.getNombre());
        holder.precio.setText(producto.getPrecio());
        Picasso.with(activity).load(producto.getImage()).into(holder.imagen);
        holder.imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, ProductoDetalleActivity.class);
                intent.putExtra("imagen", producto.getImage());
                intent.putExtra("nombre", producto.getNombre());
                intent.putExtra("descripcion", producto.getIngredientes());
                intent.putExtra("comentarios", producto.getComentarios());
                activity.startActivity(intent);
            }
        });

    }

        @Override
        public int getItemCount() {
            return productos.size();
        }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        public ImageView imagen;
        public TextView nombre;
        public TextView precio;

        public ProductViewHolder(View view) {
            super(view);
            imagen   = (ImageView) itemView.findViewById(R.id.imagen);
            nombre   = (TextView) itemView.findViewById(R.id.nombre);
            precio   = (TextView) itemView.findViewById(R.id.precio);

        }
    }

}

