from Orang import Orang

# subclass Pelanggan
class Pelanggan(Orang):

    def __init__(self, noHp: str, email: str, alamat: str,
                 nama: str, usia: int, tanggalLahir: str,
                 kodePelanggan: str, saldo: str, kuantitas: int,
                 statusMember: str, riwayatTransaksi: str):
        # panggil constructor parent (Orang)
        super().__init__(noHp, email, alamat, nama, usia, tanggalLahir)
        # atribut khusus Pelanggan
        self._kodePelanggan = str(kodePelanggan)
        self._saldo = str(saldo)  # sekarang string
        self._kuantitas = int(kuantitas)
        self._statusMember = str(statusMember)
        self._riwayatTransaksi = str(riwayatTransaksi)

    # Getter & Setter Kode Pelanggan
    def getKodePelanggan(self) -> str:
        return self._kodePelanggan

    def setKodePelanggan(self, kodePelanggan: str) -> None:
        self._kodePelanggan = str(kodePelanggan)

    # Getter & Setter Saldo (string)
    def getSaldo(self) -> str:
        return self._saldo

    def setSaldo(self, saldo: str) -> None:
        self._saldo = str(saldo)

    # Getter & Setter Kuantitas
    def getKuantitas(self) -> int:
        return self._kuantitas

    def setKuantitas(self, kuantitas: int) -> None:
        self._kuantitas = int(kuantitas)

    # Getter & Setter Status Member
    def getStatusMember(self) -> str:
        return self._statusMember

    def setStatusMember(self, statusMember: str) -> None:
        self._statusMember = str(statusMember)

    # Getter & Setter Riwayat Transaksi
    def getRiwayatTransaksi(self) -> str:
        return self._riwayatTransaksi

    def setRiwayatTransaksi(self, riwayatTransaksi: str) -> None:
        self._riwayatTransaksi = str(riwayatTransaksi)
