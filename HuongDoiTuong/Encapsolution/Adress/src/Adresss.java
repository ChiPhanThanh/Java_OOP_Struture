public class Adresss {
        private int soNha;
        private String ngo;
        private String tenDuong;
        private String tenXom;
        private String tenXa;
        private String tenQuan;
        private String Tinh;


        public Adresss() {

        }

        public Adresss(int soNha) {
            this.soNha = soNha;
        }

        public Adresss(int soNha, String ngo) {
            this(soNha);
            this.ngo = ngo;
        }

        public Adresss(int soNha, String ngo, String tenDuong) {
            this(soNha, String ngo, String tenDuong, String Xom);
            this.tenXom = tenXom;
        }

        public Adresss(int soNha, String ngo, String tenDuong, String tenXa) {
            this( int soNha, String ngo, String tenDuong){
                this.tenXa = tenXa;
            }
        }

        public Adresss(int soNha, String ngo, String tenDuong, String tenXa, String Quan) {
            this( int soNha, String ngo, String tenDuong, tenXa){
                this.tenQuan = tenQuan;
            }
        }

        public Adresss(int soNha, String ngo, String tenDuong, String tenXa, String, String Tinh) {
            this( int soNha, String ngo, String tenDuong, tenXa, Sring Quan, String Tinh){
                this.Tinh = Tinh;
            }
        }

        public int getSoNha() {
            return soNha;
        }

        public void setSoNha(int soNha) {
            this.soNha = soNha;
        }

        public String getNgo() {
            return ngo;
        }

        public void setNgo(String ngo) {
            this.ngo = ngo;
        }

        public String getTenDuong() {
            return tenDuong;
        }

        public void setTenDuong(String tenDuong) {
            this.tenDuong = tenDuong;
        }

        public String getTenXom() {
            return tenXom;
        }

        public void setTenXom(String tenXom) {
            this.tenXom = tenXom;
        }

        public String getTenXa() {
            return tenXa;
        }

        public void setTenXa(String tenXa) {
            this.tenXa = tenXa;
        }

        public String getTenQuan() {
            return tenQuan;
        }

        public void setTenQuan(String tenQuan) {
            this.tenQuan = tenQuan;
        }

        public String getTinh() {
            return Tinh;
        }

        public void setTinh(String tinh) {
            Tinh = tinh;
        }

        //method
        public String fullAdress() {
            String address = "";
            if (!soNha.isEmpty()) {
                address += " so" + soNha;
            }
            if (!ngo.isEmpty()) {
                address += "ngo" + ngo;
            }
            if (!tenDuong.isEmpty()) {
                address += "ten duong" + tenDuong;
            }
            if (!tenXom.isEmpty()) {
                address += "ten Xom:" + tenXom;
            }
            if (!tenXa.isEmpty()) {
                address += "ten Xa:" + tenXa;
            }
            if (!tenQuan.isEmpty()) {
                address += " Ten Quan:" + tenQuan;
            }
            if (!Tinh.isEmpty()) {
                address += " Tinh:" + Tinh;
            }
            return address;
        }
}
