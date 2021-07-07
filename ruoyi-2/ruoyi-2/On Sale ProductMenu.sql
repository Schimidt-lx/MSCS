-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('在售商品数据项', '1', '1', '/system/On Sale Product', 'C', '0', 'system:On Sale Product:view', '#', 'admin', sysdate(), '', null, '在售商品数据项菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('在售商品数据项查询', @parentId, '1',  '#',  'F', '0', 'system:On Sale Product:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('在售商品数据项新增', @parentId, '2',  '#',  'F', '0', 'system:On Sale Product:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('在售商品数据项修改', @parentId, '3',  '#',  'F', '0', 'system:On Sale Product:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('在售商品数据项删除', @parentId, '4',  '#',  'F', '0', 'system:On Sale Product:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('在售商品数据项导出', @parentId, '5',  '#',  'F', '0', 'system:On Sale Product:export',       '#', 'admin', sysdate(), '', null, '');
