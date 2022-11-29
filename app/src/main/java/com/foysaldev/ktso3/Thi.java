package com.foysaldev.ktso3;

public class Thi {
        private  String Ten;
        private  String CongThuc;
        private  String Cau;
        public Thi(String ten, String congThuc , String cau) {
            Ten = ten;
            CongThuc = congThuc;
            Cau = cau;
        }

        public String getTen() {
            return Ten;
        }

        public void setTen(String ten) {
            Ten = ten;
        }

        public String getCongThuc() { return CongThuc; }

        public void setCongThuc(String congThuc) {
            CongThuc = congThuc;
        }

        public String getCau() {
            return Cau;
        }

        public void setCau(String cau) {
            this.Cau = cau;
        }
    }

