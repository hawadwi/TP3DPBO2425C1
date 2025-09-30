from Orang import Orang

# subclass Pegawai
class Pegawai(Orang):

    def __init__(self, noHp: str, email: str, alamat: str,
                 nama: str, usia: int, tanggalLahir: str,
                 kodePegawai: str, jabatan: str, gaji: str, shift: str):
        # panggil constructor parent (Orang)
        super().__init__(noHp, email, alamat, nama, usia, tanggalLahir)
        # atribut khusus Pegawai
        self._kodePegawai = str(kodePegawai)
        self._jabatan = str(jabatan)
        self._gaji = str(gaji)       # gaji disimpan string biar konsisten dengan saldo
        self._shift = str(shift)

    # Getter & Setter Kode Pegawai
    def getKodePegawai(self) -> str:
        return self._kodePegawai

    def setKodePegawai(self, kodePegawai: str) -> None:
        self._kodePegawai = str(kodePegawai)

    # Getter & Setter Jabatan
    def getJabatan(self) -> str:
        return self._jabatan

    def setJabatan(self, jabatan: str) -> None:
        self._jabatan = str(jabatan)

    # Getter & Setter Gaji
    def getGaji(self) -> str:
        return self._gaji

    def setGaji(self, gaji: str) -> None:
        self._gaji = str(gaji)

    # Getter & Setter Shift
    def getShift(self) -> str:
        return self._shift

    def setShift(self, shift: str) -> None:
        self._shift = str(shift)
