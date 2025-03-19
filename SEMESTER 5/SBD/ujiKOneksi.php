<?php
$koneksi = mysqli_connect('localhost', 'root', ' ');
if ($koneksi) {
    echo "Koneksi php dan mysql berhasil";
} else {
    echo "koneksi php dan mysql tidak berhasil";
}
