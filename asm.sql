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






insert into KhachHang values(N'Monkey D. Luffy',N'Tran Duy Hung','01356789')
insert into KhachHang values(N'Roronoa Zoro',N'Sam Son','01234789')
go
insert into DanhMuc values(N'Food')
insert into DanhMuc values(N'Drinks')
go
insert into SanPham values(N'Banh mi',100000,5,'banh1.jpg',1)
insert into SanPham values(N'Banh xeo',100000,5,'banh2.jpg',1)
insert into SanPham values(N'Pho',100000,5,'banh3.jpg',1)
insert into SanPham values(N'Banh mi thit',100000,5,'banh4.jpg',1)

go
insert into DonHang values('06/06/2019',2)
insert into DonHang values('06/05/2019',1)
go
insert into ChiTietDonHang values(1,2,13000,4)
insert into ChiTietDonHang values(2,1,190000,5)
go
select * from SanPham
select * from ChiTietDonHang
Delete from SanPham where MaSP = 1 
Delete from SanPham where MASP = 2