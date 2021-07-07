-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('库存商品', '1', '1', '/system/Merchandise Inventory', 'C', '0', 'system:Merchandise Inventory:view', '#', 'admin', sysdate(), '', null, '库存商品菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('库存商品查询', @parentId, '1',  '#',  'F', '0', 'system:Merchandise Inventory:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('库存商品新增', @parentId, '2',  '#',  'F', '0', 'system:Merchandise Inventory:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('库存商品修改', @parentId, '3',  '#',  'F', '0', 'system:Merchandise Inventory:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('库存商品删除', @parentId, '4',  '#',  'F', '0', 'system:Merchandise Inventory:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('库存商品导出', @parentId, '5',  '#',  'F', '0', 'system:Merchandise Inventory:export',       '#', 'admin', sysdate(), '', null, '');
