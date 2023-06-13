package universitas;

public class Mahasiswa {
    //varibale
    private String npm, nama, prodi;
    //construktor
    public Mahasiswa(String npm, String nama, String prodi){
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }
    //get and set

    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    // Method
    public void getDetail(){
        System.out.println("Nama Mahasiswa  : " + npm);
        System.out.println("Npm Mahasiswa   : " + nama);
        System.out.println("Prodi Mahasiswa : " + prodi);
    }
}
