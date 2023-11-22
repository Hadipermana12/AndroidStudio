# Penjelasan aplikasi menghitung deret fibonacci

![](picture/00.png)



# 1. Metode countUp(View view)

public void countUp(View view) {
    EditText inputLimit = findViewById(R.id.input_limit);
    if(!inputLimit.getText().toString().isEmpty()) {
        int limit = Integer.parseInt(inputLimit.getText().toString());
        if(mCount >= limit) {
            Toast.makeText(this, "Telah mencapai limit", Toast.LENGTH_LONG).show();
            return;
        }
    }
    int next = mCount;
    mCount = secondCount;
    secondCount = next + mCount;
    if (mShowCount != null)
        mShowCount.setTextColor(setColor());
    mShowCount.setText(Integer.toString(next));
}

Metode ini terfokus pada perhitungan deret Fibonacci dan pembaruan tampilan pada suatu aplikasi. Pertama, nilai batas diambil dari komponen EditText dengan ID "input_limit". Proses ini melibatkan pengecekan apakah nilai batas tidak kosong. Jika tidak kosong, nilai tersebut dikonversi ke tipe data int. Selanjutnya, dilakukan pengecekan apakah nilai saat ini (mCount) lebih besar atau sama dengan batas yang telah ditetapkan. Jika kondisi ini terpenuhi, metode akan menampilkan pesan Toast dan menghentikan eksekusi lebih lanjut.

Jika batas tidak tercapai, metode akan melanjutkan dengan melakukan perhitungan deret Fibonacci dan mengupdate tampilan aplikasi sesuai dengan nilai yang dihitung. Selain itu, metode ini juga mengatur warna teks pada tampilan menggunakan metode setColor(). Dengan pendekatan ini, aplikasi dapat memberikan respons yang sesuai terhadap input pengguna dan memastikan bahwa perhitungan deret Fibonacci dan pembaruan tampilan berjalan dengan tepat.

# poin poin:


    -Metode ini terkait dengan penanganan perhitungan deret Fibonacci dan pembaruan tampilan.
    -Mengambil nilai batas dari EditText dengan ID input_limit.
    -Jika batas tidak kosong, maka konversi nilai tersebut ke tipe data int.
    -Jika nilai saat ini (mCount) lebih besar atau sama dengan batas, tampilkan pesan Toast dan hentikan eksekusi metode.
    -Selanjutnya, lakukan perhitungan deret Fibonacci dan perbarui tampilan sesuai dengan nilai yang dihitung.
    -Set juga warna teks pada tampilan menggunakan metode setColor().

# 2. Metode reset(View view)

public void reset(View view) {
    mCount = 0;
    secondCount = 1;
    if (mShowCount != null)
        mShowCount.setText(Integer.toString(mCount));
}

# 3. Metode setColor()

public int setColor() {
    currentFib++;
    if(currentFib % 2 == 0) {
        return ContextCompat.getColor(this, R.color.black);
    } else {
        return ContextCompat.getColor(this, R.color.white);
    }
}
