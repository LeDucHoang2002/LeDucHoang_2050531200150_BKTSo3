package com.foysaldev.ktso3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ThiAdapter extends BaseAdapter {
        private Context context;
        private int layout;
        private List<Thi> Pheptinh_List;
        public ThiAdapter(Context context, int layout, List<Thi>pheptinh_List){
            this.context=context;
            this.layout=layout;
            this.Pheptinh_List =pheptinh_List;
        }
        @Override
        public int getCount() {
            return Pheptinh_List.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(layout,null);
            TextView txtA = (TextView) view.findViewById(R.id.Ten);
            TextView txtB = (TextView) view.findViewById(R.id.CongThuc);
            TextView txtKQ = (TextView) view.findViewById(R.id.Cau);
            Thi file= Pheptinh_List.get(i);
            txtA.setText(file.getTen());
            txtB.setText(file.getCongThuc());
            txtKQ.setText(file.getCau());
            return view;
        }
    }

