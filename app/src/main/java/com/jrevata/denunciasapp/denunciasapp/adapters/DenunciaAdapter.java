package com.jrevata.denunciasapp.denunciasapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jrevata.denunciasapp.denunciasapp.R;
import com.jrevata.denunciasapp.denunciasapp.models.Denuncia;
import com.jrevata.denunciasapp.denunciasapp.services.ApiService;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by JORDAN on 14/05/2018.
 */

public class DenunciaAdapter extends RecyclerView.Adapter<DenunciaAdapter.ViewHolder>{

    private List<Denuncia> denuncias;

    public void setCompanies(List<Denuncia> denuncias) {
        this.denuncias = denuncias;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        ImageView pictureImage;
        TextView titulo;
        TextView nombre;
        TextView coordenadas;

        public ViewHolder(View itemView) {
            super(itemView);
            pictureImage = itemView.findViewById(R.id.foto_image);
            nombre = itemView.findViewById(R.id.nombre_input);
            titulo = itemView.findViewById(R.id.titulo_text);
            coordenadas = itemView.findViewById(R.id.coordenadas_input);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_complaint, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(DenunciaAdapter.ViewHolder viewHolder, final int position) {
        final Denuncia denuncia = denuncias.get(position);

        String url = ApiService.API_BASE_URL + "/images/" + denuncia.getPhoto();
        Picasso.with(viewHolder.itemView.getContext()).load(url).into(viewHolder.pictureImage);


        viewHolder.nombre.setText(denuncia.getCiudadado().getName());
        viewHolder.titulo.setText(denuncia.getTitle());
        viewHolder.coordenadas.setText(denuncia.getCoordinates());

        /*
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(holder.itemView.getContext(),DetailActivity.class);
                intent.putExtra("id", company.getId());
                holder.itemView.getContext().startActivity(intent);

            }
        });*/
    }

    @Override
    public int getItemCount() {
        return denuncias.size();
    }

}