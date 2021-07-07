-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('报废商品', '1', '1', '/system/ScrapProduct', 'C', '0', 'system:ScrapProduct:view', '#', 'admin', sysdate(), '', null, '报废商品菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('报废商品查询', @parentId, '1',  '#',  'F', '0', 'system:ScrapProduct:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('报废商品新增', @parentId, '2',  '#',  'F', '0', 'system:ScrapProduct:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('报废商品修改', @parentId, '3',  '#',  'F', '0', 'system:ScrapProduct:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('报废商品删除', @parentId, '4',  '#',  'F', '0', 'system:ScrapProduct:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('报废商品导出', @parentId, '5',  '#',  'F', '0', 'system:ScrapProduct:export',       '#', 'admin', sysdate(), '', null, '');
