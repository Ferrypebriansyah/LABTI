print("=====================PERTEMUAN 2======================")
print()
print("Nama  : Ferry Pebriansyah")
print("NPM   : 50422572")
print("Kelas : 1IA25")
print()
print("======================================================")
print()

# Konversi celcius ke reamur


def reamur(celcius):
    reamur = 4 * celcius / 5

    return reamur

# Konversi celcius ke fahrenheit


def fahrenheit(celcius):
    fahrenheit = 9 * celcius / 5 + 32

    return fahrenheit

# Konversi celcius ke kelvin


def kelvin(celcius):
    kelvin = celcius + 273

    return kelvin

# Function utama untuk menu utama


def main():
    print("===================KONVERSI SUHU======================")
    suhu = int(input("Masukan Suhu Celsius : "))

    # Mencetak hasil
    print("..................................................")
    print("Hasil Konversi Suhu", suhu, "C ke Reamur adalah", reamur(suhu), "R")
    print("Hasil Konversi Suhu", suhu,
    "C ke fahrenheit adalah", fahrenheit(suhu), "F")
    print("Hasil Konversi Suhu", suhu, "C ke kelvin adalah", kelvin(suhu), "K")
    print("..................................................")


# menjalankan Program
main()
