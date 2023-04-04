<%--
  Created by IntelliJ IDEA.
  User: ThisPC
  Date: 3/9/2023
  Time: 5:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="row">
    <div class="col-md-2"></div>
    <div class="col-md-8">
        <center>
            <h1>Thêm Khách Hàng</h1>
        </center>
    </div>
    <div class="col-md-2"></div>
</div>
<div class="row">
    <div class="col-md-2"></div>
    <div class="col-md-8">
        <form  method="POST"
               action="/../khachhang/store">
            <div class="row mt-3">
                <div class="col-6">
                    <label>Mã</label>
                    <input type="text" name="ma" class="form-control" />
                </div>
                <div class="col-6">
                    <label>Họ</label>
                    <input type="text" name="ho" class="form-control" />
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-6">
                    <label>Tên đệm</label>
                    <input type="text" name="tenDem" class="form-control" />
                </div>
                <div class="col-6">
                    <label>Tên</label>
                    <input type="text" name="ten" class="form-control" />
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-6">
                    <label>Ngày sinh</label>
                    <input type="date" name="ngaySinh" class="form-control" />
                </div>
                <div class="col-6">
                    <label>SDT</label>
                    <input type="tel" name="sdt" class="form-control" />
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-6">
                    <label>Địa chỉ</label>
                    <input type="text" name="diaChi" class="form-control" />
                </div>
                <div class="col-6">
                    <label>Mật khẩu</label>
                    <input type="password" name="matKhau" class="form-control" />
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-6">
                    <label>Thành phố</label>
                    <select name="thanhPho" class="form-select">
                        <option value="Hà Nội">Hà Nội</option>
                        <option value="Thanh Hóa">Thanh Hóa</option>
                    </select>
                </div>
                <div class="col-6">
                    <label>Quốc gia</label>
                    <select name="quocGia" class="form-select">
                        <option value="Việt Nam">Việt Nam</option>
                        <option value="Mỹ">Mỹ</option>
                    </select>
                </div>
            </div>
            <br>
            <button type="submit" class="btn btn-primary">Thêm</button>
        </form>
    </div>
    <script src="/../js/bootstrap.min.js"></script>
    <div class="col-md-2"></div>
</div>
