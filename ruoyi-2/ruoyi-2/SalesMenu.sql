-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('销售订单', '1', '1', '/system/Sales', 'C', '0', 'system:Sales:view', '#', 'admin', sysdate(), '', null, '销售订单菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('销售订单查询', @parentId, '1',  '#',  'F', '0', 'system:Sales:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('销售订单新增', @parentId, '2',  '#',  'F', '0', 'system:Sales:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('销售订单修改', @parentId, '3',  '#',  'F', '0', 'system:Sales:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('销售订单删除', @parentId, '4',  '#',  'F', '0', 'system:Sales:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('销售订单导出', @parentId, '5',  '#',  'F', '0', 'system:Sales:export',       '#', 'admin', sysdate(), '', null, '');
