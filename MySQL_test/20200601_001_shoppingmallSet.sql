CREATE TABLE `member` (
	`m_id`	varchar(15)	NOT NULL,
	`m_pw`	varchar(255)	NULL,
	`m_email`	varchar(50)	NULL,
	`m_name`	varchar(50)	NULL,
	`m_regident_num`	varchar(14)	NULL,
	`m_address`	varchar(50)	NULL,
	`m_phone_num`	varchar(13)	NULL,
	`m_business_num`	varchar(12)	NULL,
	`m_authority`	varchar(10)	NULL,
	`m_withdraw`	varchar(1)	NULL
);

CREATE TABLE `product` (
	`pd_code`	varchar(10)	NOT NULL,
	`pd_name`	varchar(30)	NULL,
	`pd_price`	int	NULL,
	`pd_type`	varchar(10)	NULL
);

CREATE TABLE `product_registration` (
	`pr_num`	int	NOT NULL,
	`pr_title`	varchar(255)	NULL,
	`pr_contents`	text	NULL,
	`pr_thumbnail`	varchar(255)	NULL,
	`pr_reporting_date`	datetime	NULL,
	`pr_delivery_charge`	int	NULL,
	`pr_delivery_limit`	int	NULL,
	`pr_delivery_type`	varchar(10)	NULL,
	`pr_m_id`	varchar(15)	NOT NULL
);

CREATE TABLE `registration_list` (
	`rl_num`	int	NOT NULL,
	`rl_amount`	int	NULL,
	`rl_pr_num`	int	NOT NULL,
	`pd_code`	varchar(10)	NOT NULL
);

CREATE TABLE `purchase` (
	`pc_num`	varchar(20)	NOT NULL,
	`pc_price`	int	NULL,
	`pc_m_id`	varchar(15)	NOT NULL
);

CREATE TABLE `purchase_list` (
	`pl_num`	int	NOT NULL,
	`pl_amount`	int	NULL,
	`pl_pc_num`	varchar(20)	NOT NULL,
	`pl_pd_code`	varchar(10)	NOT NULL
);

ALTER TABLE `member` ADD CONSTRAINT `PK_MEMBER` PRIMARY KEY (
	`m_id`
);

ALTER TABLE `product` ADD CONSTRAINT `PK_PRODUCT` PRIMARY KEY (
	`pd_code`
);

ALTER TABLE `product_registration` ADD CONSTRAINT `PK_PRODUCT_REGISTRATION` PRIMARY KEY (
	`pr_num`
);

ALTER TABLE `registration_list` ADD CONSTRAINT `PK_REGISTRATION_LIST` PRIMARY KEY (
	`rl_num`
);

ALTER TABLE `purchase` ADD CONSTRAINT `PK_PURCHASE` PRIMARY KEY (
	`pc_num`
);

ALTER TABLE `purchase_list` ADD CONSTRAINT `PK_PURCHASE_LIST` PRIMARY KEY (
	`pl_num`
);
