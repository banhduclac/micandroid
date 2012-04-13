﻿Jxstar.currentPage = function() {
	var config = {param:{},initpage:function(page, define){},eventcfg:{}};

	var pletcolnoData = Jxstar.findComboData('pletcolno');

	var cols = [
	{col:{header:'*显示名称', width:168, sortable:true, editable:true, hcss:'color:#0000ff;',
		editor:new Ext.form.TextField({
			maxLength:50, allowBlank:false
		})}, field:{name:'plet_portlet__portlet_title',type:'string'}},
	{col:{header:'*显示序号', width:62, sortable:true, defaultval:'10', align:'right',
		editable:true, hcss:'color:#0000ff;',
		editor:new Ext.form.NumberField({
			maxLength:12, allowBlank:false,
			allowNegative: false
		}),renderer:JxUtil.formatInt()}, field:{name:'plet_portlet__portlet_no',type:'int'}},
	{col:{header:'*所属列', width:79, sortable:true, defaultval:'1', align:'center',
		editable:true, hcss:'color:#0000ff;',
		editor:new Ext.form.ComboBox({
			store: new Ext.data.SimpleStore({
				fields:['value','text'],
				data: pletcolnoData
			}),
			emptyText: jx.star.select,
			mode: 'local',
			triggerAction: 'all',
			valueField: 'value',
			displayField: 'text',
			editable:false, allowBlank:false,
			value: pletcolnoData[0][0]
		}),
		renderer:function(value){
			for (var i = 0; i < pletcolnoData.length; i++) {
				if (pletcolnoData[i][0] == value)
					return pletcolnoData[i][1];
			}
		}}, field:{name:'plet_portlet__col_no',type:'string'}},
	{col:{header:'栏目名称', width:100, sortable:true}, field:{name:'plet_portlet__type_name',type:'string'}},
	{col:{header:'模板ID', width:100, sortable:true, hidden:true}, field:{name:'plet_portlet__templet_id',type:'string'}},
	{col:{header:'栏目ID', width:100, sortable:true, hidden:true}, field:{name:'plet_portlet__type_id',type:'string'}},
	{col:{header:'内容ID', width:100, sortable:true, hidden:true}, field:{name:'plet_portlet__portlet_id',type:'string'}},
	{col:{header:'栏目代号', width:100, sortable:true}, field:{name:'plet_portlet__type_code',type:'string'}},
	{col:{header:'对象名称', width:161, sortable:true}, field:{name:'plet_portlet__object_name',type:'string'}},
	{col:{header:'对象ID', width:100, sortable:true, hidden:true}, field:{name:'plet_portlet__object_id',type:'string'}}
	];
	
	config.param = {
		cols: cols,
		sorts: null,
		hasQuery: '0',
		isedit: '1',
		isshow: '0',
		funid: 'plet_portlet'
	};
	
	config.eventcfg = {				setFun: function() {			var records = this.grid.getSelectionModel().getSelections();			if (!JxUtil.selectone(records)) return;						var typecode = records[0].get('plet_portlet__type_code');			if (typecode != 'portlet_fun') {				JxHint.alert(jx.sys.funlink);	//'只有常用功能栏目才需要设置！'				return;			}			//过滤条件			var where_sql = 'plet_fun.portlet_id = ?';			var where_type = 'string';			var where_value = records[0].get('plet_portlet__portlet_id');						//显示数据			var hdcall = function(grid) {				JxUtil.delay(500, function(){					//处理树形页面的情况					if (!grid.isXType('grid')) {						grid = grid.getComponent(1).getComponent(0);					}					//设置外键值					grid.fkValue = where_value;					Jxstar.loadData(grid, {where_sql:where_sql, where_value:where_value, where_type:where_type});				});			};					var define = Jxstar.findNode('plet_fun');			//显示数据			Jxstar.showData({				filename: define.gridpage,				title: define.nodetitle, 				pagetype: 'editgrid',				nodedefine: define,				callback: hdcall			});		}			};
		
	return new Jxstar.GridNode(config);
}