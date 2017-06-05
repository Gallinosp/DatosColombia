package com.example.dell.datoscolombia;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dell.datoscolombia.models.Dato;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Gallo on 1/06/2017.
 */

public class ListaAdapter  extends RecyclerView.Adapter<ListaAdapter.ViewHolder> {
    private ArrayList<Dato> dataset;

    private Context context;

    public ListaAdapter(Context context) {
        this.context = context;
        dataset = new ArrayList<>();

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Dato p = dataset.get(position);
        holder.Departamento.setText(p.getDepartamento());
        holder.Dia.setText(p.getD_a().toString());
        holder.lugar.setText(p.getMunicipio());
        holder.hora.setText(p.getHora());
        holder.Barrio.setText(p.getBarrio());
        holder.Zona.setText(p.getZona());
        holder.Sitio.setText(p.getClaseDeSitio());
        holder.Fecha.setText(p.getArmaEmpleada());
        holder.Edad.setText(p.getEdad());
        holder.Sexo.setText(p.getSexo());
        holder.Civil.setText(p.getEstado_civil());
        holder.Ocupacion.setText(p.getClase_de_empleado());
        holder.Estuduio.setText(p.getEscolaridad());
        holder.Codigo.setText(p.getCDigoDane());
        //holder.Fecha.setText(new SimpleDateFormat("dd/MM/yyyy").format(p.getFecha()));

    }

    @Override
    public int getItemCount() {

        return dataset.size();
    }

    public void adicionarDato(ArrayList<Dato> listaAuto) {
        dataset.addAll(listaAuto);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private TextView Departamento;
        private TextView Dia;
        private TextView lugar;
        private TextView hora;
        private TextView Barrio;
        private TextView Zona;
        private TextView Sitio;
        private TextView Fecha;
        private TextView Edad;
        private TextView Sexo;
        private TextView Civil;
        private TextView Ocupacion;
        private TextView Estuduio;
        private TextView Codigo;


        public ViewHolder(View itemView) {
            super(itemView);


            Departamento = (TextView) itemView.findViewById(R.id.Departamento);
            Dia = (TextView) itemView.findViewById(R.id.Dia);
            lugar = (TextView) itemView.findViewById(R.id.lugar);
            hora = (TextView) itemView.findViewById(R.id.hora);
            Barrio = (TextView) itemView.findViewById(R.id.Barrio);
            Zona = (TextView) itemView.findViewById(R.id.Zona);
            Sitio = (TextView) itemView.findViewById(R.id.Sitio);
            Fecha = (TextView) itemView.findViewById(R.id.Arma);
            Edad = (TextView) itemView.findViewById(R.id.Edad);
            Sexo = (TextView) itemView.findViewById(R.id.Sexo);
            Civil = (TextView) itemView.findViewById(R.id.Civil);
            Ocupacion = (TextView) itemView.findViewById(R.id.Ocupacion);
            Estuduio = (TextView) itemView.findViewById(R.id.Estudio);
            Codigo = (TextView) itemView.findViewById(R.id.Codigo);

        }
    }
}
