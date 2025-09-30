# kelas induk
class InformasiKontak:
    
    def __init__(self, noHp: str, email: str, alamat: str):
        self._noHp = str(noHp)       # semi private
        self._email = str(email)     # semi private
        self._alamat = str(alamat)   # semi private

    # Getter dan Setter No HP
    def getNoHp(self) -> str:
        return self._noHp
    
    def setNoHp(self, noHp: str) -> None:
        self._noHp = str(noHp)

    # Getter dan Setter Email
    def getEmail(self) -> str:
        return self._email
    
    def setEmail(self, email: str) -> None:
        self._email = str(email)

    # Getter dan Setter Alamat
    def getAlamat(self) -> str:
        return self._alamat
    
    def setAlamat(self, alamat: str) -> None:
        self._alamat = str(alamat)
