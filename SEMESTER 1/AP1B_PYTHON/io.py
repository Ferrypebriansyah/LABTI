print("PROGRAM PYTHON MENGHITUNG NILAI RATA-RATA")

n = int(input("Banyaknya Bilangan: "))

print()  # Membuat baris baru
bilangan = []
jumlah = 0

for i in range(0, n):
    temp = int(input("Masukkan bilangan ke-%1d: " % (i+1)))
    bilangan.append(temp)
    jumlah += bilangan[i]
    rata2 = jumlah / n

print(bilangan)
print("nilai maksimum : ", max(bilangan))
print("nilai minimum : ", min(bilangan))

print("\nRata-rata  = %0.2f" % rata2)
