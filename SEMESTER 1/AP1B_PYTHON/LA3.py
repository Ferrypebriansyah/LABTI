x = 1
print("== PROGRAM MENENTUKAN TINGKAT RESIKO PENYAKIT JANTUNG ==")
data = int(input("Masukkan banyak data : "))
# Menggunakan aturan berdasarkan umur dan Indeka Massa Tubuh (IMT)
while x <= data:
    print("==================================================")
    print()
    print("                  Data ke-", x)
    print()
    print("=================== Data Pasien ==================")
    print()
    nama = input("Masukkan Nama Anda                : ")
    umur = int(input("Masukkan Umur Anda                : "))
    bb = int(input("Masukkan Berat Badan (kg)         : "))
    tb = int(input("Masukkan Tinggi Badan (cm)        : "))
    print()
    print("==================================================")
    imt = bb / ((tb/100) * (tb/100))
    print("Nama        : ", nama)
    print("Umur        : ", umur)
    print("Berat Badan : ", bb, "kg")
    print("Tinggi Badan:", tb, "cm")
    print("total imt : ", imt)

    if umur < 45 and imt < 22.0:
        print("Tingkat resiko penyakit jantung Anda: RENDAH")
    elif (umur < 45 and imt >= 22.0) or (umur >= 45 and imt < 22.0):
        print("Tingkat resiko jantung Anda: SEDANG")
    else:
        print("Tingkat resiko penyakit jantung Anda: TINGGI")

    x = x + 1
