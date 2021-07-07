-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('进货单', '1', '1', '/system/Income', 'C', '0', 'system:Income:view', '#', 'admin', sysdate(), '', null, '进货单菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('进货单查询', @parentId, '1',  '#',  'F', '0', 'system:Income:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('进货单新增', @parentId, '2',  '#',  'F', '0', 'system:Income:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('进货单修改', @parentId, '3',  '#',  'F', '0', 'system:Income:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('进货单删除', @parentId, '4',  '#',  'F', '0', 'system:Income:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('进货单导出', @parentId, '5',  '#',  'F', '0', 'system:Income:export',       '#', 'admin', sysdate(), '', null, '');
