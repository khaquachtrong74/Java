# Hệ Thống Đánh Giá Sinh Viên OU

## Mô tả:

    Để đảm bảo chất lượng đào tạo, trường Đại học OU đều thực hiện khảo sát sinh viên để phản hồi ý kiến về tổ chức đào tạo. 
        Sinh viên bao gồm thông tin MSSV, họ tên, giới tính, ngày sinh. 
        Sinh viên có thể thực hiện nhiều đánh giá trong học kỳ, 
            mỗi đánh giá ghi nhận mã đánh giá (tự nguyên tăng tự động), nội dung đánh giá, sinh viên thực hiện đánh giá, ngày thực hiện 
            đánh giá học kỳ và năm học thực hiện đánh giá. Hiện tại, sinh viên có thể thực hiện các đánh giá thuộc hai nhóm chính:

    Đánh giá giảng viên: với đánh giá này, sinh viên cần chọn thông tin giảng viên đánh giá, điểm đánh giá (trên thang 4), 
    mỗi giảng viên gồm thông tin mã giảng viên, họ tên, giới tính, ngày sinh.
    Đánh giá cơ sở vật chất: với đánh giá này tên cơ sở được đánh giá (VVT, HHL, NH).

## Chức Năng Yêu Cầu

    Hiển thị danh sách đánh giá trong học kỳ và năm học chỉ định
    Thêm đánh giá mới (giảng viên hoặc cơ sở vật chất)
    Xác định danh sách đánh giá cơ sở vật chất tại NH trong học kỳ chỉ định
    Tính điểm trung bình giảng viên trong học kỳ chỉ định
    Sắp xếp sinh viên:
    Giảm dần theo năm sinh
    Nếu cùng năm sinh thì tăng dần theo họ tên
    Lưu Ý Triển Khai
    Phải kiểm tra tất cả chức năng trong hàm main
    Định dạng ngày tháng: dd/MM/yyyy