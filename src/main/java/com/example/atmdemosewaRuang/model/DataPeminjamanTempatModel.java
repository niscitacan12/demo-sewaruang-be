package com.example.atmdemosewaRuang.model;

import javax.persistence.*;

@Entity
@Table(name = "data_booking_tempat")
public class DataPeminjamanTempatModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "jumlah_orang")
    private String jumlah_orang;

    @Column(name = "tanggal")
    private String tanggal;

    @Column(name = "jam_awal")
    private String jam_awal;

    @Column(name = "jam_akhir")
    private String jam_akhir;

    @Column(name = "keterangan")
    private String keterangan;

    @ManyToOne
    @JoinColumn(name = "nama_pelanggan_id")
    private PelangganModel pelangganModel;

    @ManyToOne
    @JoinColumn(name = "nama_item_id")
    private TambahMenuModel tambahMenuModel;

    @ManyToOne
    @JoinColumn(name = "tempat_id")
    private DataRuangModel dataRuangModel;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getJumlah_orang() {
        return jumlah_orang;
    }
    public void setJumlah_orang(String jumlah_orang) {
        this.jumlah_orang = jumlah_orang;
    }

    public String getTanggal() {
        return tanggal;
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJam_awal() {
        return jam_awal;
    }
    public void setJam_awal(String jam_awal) {
        this.jam_awal = jam_awal;
    }

    public String getJam_akhir() {
        return jam_akhir;
    }
    public void setJam_akhir(String jam_akhir) {
        this.jam_akhir = jam_akhir;
    }

    public String getKeterangan() {
        return keterangan;
    }
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public PelangganModel getPelangganModel() {
        return pelangganModel;
    }
    public void setPelangganModel(PelangganModel pelangganModel) {
        this.pelangganModel = pelangganModel;
    }

    public TambahMenuModel getTambahMenuModel() {
        return tambahMenuModel;
    }
    public void setTambahMenuModel(TambahMenuModel tambahMenuModel) {
        this.tambahMenuModel = tambahMenuModel;
    }

    public DataRuangModel getDataRuangModel() {
        return dataRuangModel;
    }
    public void setDataRuangModel(DataRuangModel dataRuangModel) {
        this.dataRuangModel = dataRuangModel;
    }
}
