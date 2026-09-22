package com.example.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val btnGoToMain = findViewById<Button>(R.id.btnGoToMain)

        // Bắt sự kiện click để quay lại MainActivity
        btnGoToMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // Thêm cờ này để tránh tạo thêm nhiều bản sao của MainActivity chồng lên nhau
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)

            // Lưu ý: Nếu chỉ đơn thuần là quay lại màn hình trước đó, bạn cũng có thể
            // bỏ đoạn tạo Intent đi và chỉ cần gọi hàm: finish()
        }
    }
}