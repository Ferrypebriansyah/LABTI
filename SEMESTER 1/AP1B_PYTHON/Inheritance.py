class Orang:
    def __init__(self, nama, kelas, npm):
        self.__nama = nama
        self.__kelas = kelas
        self.__npm = npm
    def tampilkan_nama(self):
        print('Nama Saya adalah', self.__nama)
    def tampilkan_kelas(self):
        print('Saya kelas', self.__kelas)
    def tampilkan_npm(self):
        print('NPM Saya adalah', self.__npm)
        
class Siswa(Orang):
    def __init__(self, nama, kelas, npm, angkatan):
        Orang.__init__(self, nama, kelas, npm)
        self.__angkatan = angkatan
    def tampilkan_tingkat(self):
        print('Saya angkatan tahun', self.__angkatan)

