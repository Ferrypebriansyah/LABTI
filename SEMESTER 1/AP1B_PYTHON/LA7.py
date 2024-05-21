import Encapsulation
import Inheritance
import Polymorphism

def encap():
    segitiga_besar = Encapsulation.Segitiga(100, 80)
    print('Alas   :',segitiga_besar.alas)
    print('Tinggi :',segitiga_besar.tinggi)
    print('Luas   :',segitiga_besar.luas)

def inher():
    siswa = Inheritance.Siswa('Ferry Pebriansyah', '1IA25', 50422572, 2022)
    siswa.tampilkan_nama()
    siswa.tampilkan_kelas()
    siswa.tampilkan_npm()
    siswa.tampilkan_tingkat()
    
def poly():
    mamalia = Polymorphism.Mamalia('Mamalia Generik')
    mamalia.tampilkan_spesies()
    mamalia.buat_suara()
    print()
    anjing = Polymorphism.Anjing()
    anjing.tampilkan_spesies()
    anjing.buat_suara()
    print()
    kucing = Polymorphism.Kucing()
    kucing.tampilkan_spesies()
    kucing.buat_suara()

def main():
    a = 0
    while (a != 4):
        print("1. ENCAPSULATION")
        print("2. INHERITANCE")
        print("3. POLYMORPHISM")
        print("4. Exit")
        a = int(input('Pilih: '))
        
        if a == 1:
            encap()
        elif a == 2:
            inher()
        elif a == 3:
            poly()
    else:
        print("bye")
        
main()


