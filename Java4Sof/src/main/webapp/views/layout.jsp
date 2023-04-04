<%--
  Created by IntelliJ IDEA.
  User: tiennh
  Date: 3/21/23
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/../css/bootstrap.min.css"/>
</head>
<body>
<div ng-app="app-route">
    <br>
    <div class="container-fluid">
        <!-- đầu trang -->
        <header class="row trang">
            <div class="col-sm-3 col-md-2 trang"></div>
            <div class="col-sm-2 col-md-2 trang"><label>Hotline Liên Hệ :</label></div>
            <br>
            <div class="col-sm-2 col-md-2 trang"><label><a class="fw-bold">0865715802 </a> | <a class="fw-bold">
                0598941556</a></label></div>
            <div class="col-sm-3 col-md-3 trang"><label>
                <h6>Giờ làm việc T2-T6(8H-21h) T7-CN(9H-20H)</h6>
            </label></div>
            <br>
            <div class="col-sm-2 col-md-3 trang"><label>
                <button type="button" class="btn btn-primary">Đăng
                    Nhập
                </button>
                <button type="button" class="btn btn-link ">Đăng Ký</button>
            </label></div>
        </header>
        <hr>
        <!-- slidẻ show -->
<%--        <div class="row">--%>
<%--            <div class="col-sm-3 col-md-1"></div>--%>
<%--            <div class="slider col-sm-12 col-md-10">--%>
<%--                <div id="carouselExampleFade" class="carousel slide carousel-fade">--%>
<%--                    <div class="carousel-inner">--%>
<%--                        <div class="carousel-item active">--%>
<%--                            <img src="https://puolotrip.com/wp-content/uploads/2022/12/sider-tet.jpg"--%>
<%--                                 class="d-block w-100" alt="...">--%>
<%--                        </div>--%>
<%--                        <div class="carousel-item">--%>
<%--                            <img src="http://dulich32011.demo.xemwebmau.com/wp-content/uploads/2018/12/1510895196.jpeg"--%>
<%--                                 class="d-block w-100" alt="...">--%>
<%--                        </div>--%>
<%--                        <div class="carousel-item">--%>
<%--                            <img src="https://puolotrip.com/wp-content/uploads/2022/12/sider-tet.jpg"--%>
<%--                                 class="d-block w-100" alt="...">--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleFade"--%>
<%--                            data-bs-slide="prev">--%>
<%--                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>--%>
<%--                        <span class="visually-hidden">Previous</span>--%>
<%--                    </button>--%>
<%--                    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleFade"--%>
<%--                            data-bs-slide="next">--%>
<%--                        <span class="carousel-control-next-icon" aria-hidden="true"></span>--%>
<%--                        <span class="visually-hidden">Next</span>--%>
<%--                    </button>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--            <div class="col-sm-3 col-md-1"></div>--%>
<%--        </div>--%>
        <hr>
        <!-- chức năng -->
        <header>
            <nav class="navbar navbar-expand-lg navbar-dark " style="background-color: #192041;color: white">
                <div class="container">
                    <a class="navbar-brand" href="#!/">
                        <img style="height: 80px" src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/FPT_Polytechnic.png/1200px-FPT_Polytechnic.png" alt=""/>
                    </a>
                    <button
                            class="navbar-toggler"
                            type="button"
                            data-bs-toggle="collapse"
                            data-bs-target="#navbarSupportedContent"
                            aria-controls="navbarSupportedContent"
                            aria-expanded="false"
                            aria-label="Toggle navigation"
                    >
                        <span class="bi bi-list"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link" href="/../khachhang/index">Khách hàng</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/../ctsanpham/index">Sản phẩm</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/../chucvu/index">Chức Vụ</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/../cuahang/index">Cửa Hàng</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/../nsx/index">Nhà Sản Xuất</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/DuAnMauJava4_war_exploded/mausac/index">Màu Sắc</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/../dongSP/index">Dòng Sản Phẩm</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/DuAnMauJava4_war_exploded/nhanvien/index">Nhân Viên</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/DuAnMauJava4_war_exploded/ctsanpham/index">Chi Tiết Sản Phẩm</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/DuAnMauJava4_war_exploded/hoadon/index">Hóa Đơn</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/DuAnMauJava4_war_exploded/hoadonct/index">Hóa Đơn Chi Tiết</a>
                            </li>

                        </ul>
                    </div>
                </div>
            </nav>
        </header>
        <hr>
        <div class="row mt-10" style="min-height: 500px;">
            <div class="col-3">
                <img src="data:image/png;base64,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" style="width: 105%;height: 100%">
            </div>
            <div class="col-9" style="background: white">
                <jsp:include page="${ view }"/>
            </div>
        </div>
        <!-- cuối trang -->
        <hr>
        <footer class="row">
            <section class="nen">
                <center>
                    <br>
                    <h2 class="text-uppercase fw-bold" style="color: rgb(0, 110, 255)">
                        HỆ THỐNG Công Ty Du Lịch Lữ Hành
                    </h2>
                    <small>Trụ sở chính P308, Tầng 3, tòa nhà The One, số 2 Chương Dương Độ, P.Chương Dương,
                        Q.Hoàn
                        Kiếm, Hà Nội
                    </small>
                </center>
                <div class="container text-center ">
                    <div class="row ">
                        <div class=" col-sm-3 col-md-3">
                            <h6 class="text-uppercase fw-bold mb-4">
                            </h6>
                            <h6>THÔNG TIN LIÊN HỆ</h6>
                            <p>Cty Cổ Phần Lữ Hành ...</p>
                            <p>Điện thoại: +84865715802</p>
                            <p>Email: luhanh...@gmail.com</p>
                        </div>

                        <div class="col-sm-3 col-md-3">
                            <h8>
                                <a href="#!" style="color: rgb(255, 72, 0)"> Hà Nội</a>
                                <p>
                                    P308, Tầng 3, tòa nhà The One, số 2 Chương Dương Độ, P.Chương Dương, Q.Hoàn
                                    Kiếm, Hà Nội
                                </p>
                            </h8>
                            <br/>
                            <h8>
                                <a href="#!" style="color: rgb(255, 72, 0)">Cần Thơ</a>
                                <p>
                                    Tầng 7 - Tòa nhà STS - 11B Đại Lộ Hòa Bình, P. Tân An, Q. Ninh Kiều, TP. Cần
                                    Thơ.
                                </p>
                            </h8>
                        </div>

                        <div class="col-sm-3 col-md-3">
                            <h8>
                                <a href="#!" style="color: rgb(255, 72, 0)">Hồ Chí Minh</a>
                                <p>
                                    Tầng 5, Tòa nhà Anh Đăng, 215 Nam Kỳ Khởi Nghĩa, Phường 7, Quận 3, Tp. Hồ
                                    Chí
                                    Minh
                                </p>
                            </h8>
                            <br/>
                            <h8>
                                <a href="#!" style="color: rgb(255, 72, 0)">Tây Nguyên</a>
                                <p>
                                    Số 300/6 đường Hà Huy Tập, p. Tân An, TP. Buôn Ma Thuột, Đắk
                                    Lắk (0262) 355 5678
                                </p>
                            </h8>
                        </div>
                    </div>
                </div>
            </section>

            <div class="text-center py-4" style="background-color: rgba(0, 0, 0, 0.05)">
                © 2023 Copyright:
                <a class="text-reset fw-bold" href="https://mdbootstrap.com/">Nguyễn Đức Huy</a>
            </div>
        </footer>
    </div>
</div>
</body>
</html>
