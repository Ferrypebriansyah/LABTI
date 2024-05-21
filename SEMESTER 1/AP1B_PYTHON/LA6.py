import Fibonacci
import Faktorial
import LuasPP
import KelilingPP


def main():
    pilih = 0
    while pilih != 4:
        print("\n=== MODULE ===")
        print("1. Faktorial")
        print("2. Fibonacci")
        print("3. Persegi Panjang")
        print("4. Exit")
        pilih = int(input("Pilih Menu : "))

        if pilih == 1:
            print("\n=== Faktorial ===")
            n = int(input('Masukkan Nilai n : '))
            print(f'{n}! = {Faktorial.fakto(n)}')

        elif pilih == 2:
            print("\n=== Fibonacci ===")
            n = int(input("Masukkan Nilai n : "))
            f = Fibonacci.fibo(n)
            print(f'Suku ke-{n} dari barisan Fibonacci: {f} ')

        elif pilih == 3:
            print("\n=== Persegi Panjang ===") 
            p = int(input('Masukkan Panjang : '))
            l = int(input('Masukkan Lebar : '))
            total = LuasPP.luas(p, l)
            print ("\nLuas dan Keliling Persegi Panjang")
            print(f'Luas Persegi panjang adalah : {total} cm')
            total = KelilingPP.keliling(p, l)
            print(f'Keliling Persegi panjang adalah: {total} cm')

        elif pilih == 4:
            print("Selamat Tinggal..")

        else:
            print("bye")
        
main()

