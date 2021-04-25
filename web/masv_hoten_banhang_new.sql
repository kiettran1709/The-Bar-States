
create database asm
go
use asm
go
create table account
(
	username varchar(50) primary key,
	password varchar(50)
)
go
insert into account values('admin','123')
go
select * from account
go


create table DanhMuc
(
	MaDM int identity(1,1) primary key,
	TenDM nvarchar(100) not null
)
select
go
create table SanPham
(
	MaSP int identity(1,1) primary key,
	TenSP nvarchar(50) not null,
	DonGia int,
	SoLuong int,
	Hinh varchar(50),
	MaDM int references DanhMuc(MaDM)
)
go
create table KhachHang
(
	MaKH int identity(1,1) primary key,
	TenKH nvarchar(50) not null,
	DiaChi nvarchar(100),
	DienThoai varchar(15),
)
go



create table DonHang
(
	MaDH int identity(1,1) primary key,
	NgayDatHang date,
	MaKH int references KhachHang(MaKH)
	
)
go
create table ChiTietDonHang
(
	MaDH int references DonHang(MaDH),
	MaSP int references SanPham(MaSP),
	DonGia int,
	SoLuong int
	Constraint pk_CTDH primary key(MaDH,MaSP)
)
go








