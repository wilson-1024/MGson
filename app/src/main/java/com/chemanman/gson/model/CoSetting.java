package com.chemanman.gson.model;

import com.chemanman.lib_mgson.MGson;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 开单设置
 * Created by yusihan on 2016/12/19.
 */
public class CoSetting {

    /**
     * company_id : 14
     * company_name : 范式总部
     * order_data : {"billing_date":{"value":"2017-02-10 15:10:32","editable":true},"order_num":{"value":"08881117020033","editable":true},"order_creator":{"value":10942,"editable":false},"order_creator_name":{"value":"zhangsan_2","editable":false},"mgr_id":{"value":10942,"editable":true},"start_info":{"value":{"show_val":"测试区","province":"陕西省","city":"大同市","district":"测试区","adcode":"110105","poi":"116.443108,39.92147"},"editable":true},"base_enum":{"mgr_id_info":{"id":10942,"name":"李四111","telephone":"222222222"},"receipt_cat_info":{"display":"回单"}}}
     * co_setting : {"order_setting":{"is_switch":false,"switch_set":false},"num_rule":[],"order_num":{"switch_set":true,"checked":"custom","auto_by":"point","auto_no_moify":false,"cus_no_modify":false,"seq_figure":"","optional":{},"selected":{}},"goods_num":{"switch_set":true,"checked":"custom","no_moify":false,"set_rules":{}},"co_show":[],"co_type":{},"show_type":{},"co1":{"co":{"arr":{"required":true,"show":true},"billing_date":{"required":true,"show":true},"cashreturn":{"required":false,"show":false},"cat":{"required":false,"show":false},"co_delivery":{"required":false,"show":true},"co_delivery_adv":{"required":false,"show":false},"co_delivery_f":{"required":false,"show":true},"co_delivery_fee":{"required":false,"show":true},"co_freight_f":{"required":true,"show":true},"co_handling_f":{"required":false,"show":true},"co_in_wh_f":{"required":false,"show":false},"co_install_f":{"required":false,"show":false},"co_insurance":{"required":false,"show":true},"co_misc_f":{"required":false,"show":true},"co_pay_adv":{"required":false,"show":false},"co_pickup_f":{"required":false,"show":false},"co_pkg_f":{"required":false,"show":false},"co_storage_f":{"required":false,"show":false},"co_trans_f":{"required":false,"show":false},"co_upstairs_f":{"required":false,"show":false},"cor_cee_addr":{"required":false,"show":true},"cor_cee_area":{"required":false,"show":true},"cor_cee_com":{"required":false,"show":false},"cor_cee_id_num":{"required":false,"show":false},"cor_cee_mobile":{"required":false,"show":true},"cor_cee_name":{"required":true,"show":true},"cor_cee_phone":{"required":false,"show":false},"declared_value":{"required":false,"show":true},"delivery_mode":{"required":false,"show":true},"discount":{"required":false,"show":false},"entrust_num":{"required":false,"show":true},"goods_num":{"required":false,"show":true},"invoice":{"required":false,"show":false},"mgr_id":{"required":false,"show":false},"model":{"required":false,"show":false},"name":{"required":false,"show":true},"notice_delivery":{"required":false,"show":true},"num":{"required":false,"show":true},"order_creator_name":{"required":true,"show":true},"order_num":{"required":true,"show":true},"pay_arrival":{"required":false,"show":true},"pay_billing":{"required":false,"show":true},"pay_co_delivery":{"required":false,"show":true},"pay_credit":{"required":false,"show":true},"pay_mode":{"required":true,"show":true},"pay_monthly":{"required":false,"show":true},"pay_owed":{"required":false,"show":true},"pay_receipt":{"required":false,"show":true},"pick_dist":{"required":false,"show":false},"pickup":{"required":false,"show":false},"pkg":{"required":false,"show":false},"rcv_stn":{"required":false,"show":false},"rebate":{"required":false,"show":true},"receipt_cat":{"required":false,"show":true},"receipt_n":{"required":false,"show":true},"receipt_num":{"required":false,"show":false},"remark":{"required":false,"show":true},"route":{"required":true,"show":true},"shaped":{"required":false,"show":false},"shud_arr_date":{"required":false,"show":false},"sped":{"required":false,"show":false},"start":{"required":false,"show":true},"trsp_mode":{"required":false,"show":false},"unit_p":{"required":false,"show":true},"unit_p_unit":{"required":false,"show":true},"volume":{"required":false,"show":true},"weight":{"required":false,"show":false},"xpcd_arr_date":{"required":false,"show":true}},"switch_set":true},"empty_pre_order":{"switch_set":true,"order_n":{"show":true,"required":true},"order_num_range":{"show":true,"required":true},"cor_name":{"show":true,"required":false},"cor_mobile":{"show":true,"required":false},"cee_addr":{"show":true,"required":false},"cor_area":{"show":true,"required":false},"mgr_id":{"show":true,"required":false},"name":{"show":true,"required":false}},"tags_pre_order":{"switch_set":true,"order_num":{"show":true,"required":true},"goods_num":{"show":true,"required":false},"arr":{"show":true,"required":false},"cor_name":{"show":true,"required":false},"cor_mobile":{"show":true,"required":false},"cee_name":{"show":true,"required":false},"cee_mobile":{"show":true,"required":false},"name":{"show":true,"required":false},"num":{"show":true,"required":false},"weight":{"show":false,"required":false},"volume":{"show":false,"required":false},"co_freight_f":{"show":false,"required":false},"remark":{"show":false,"required":false}},"print_option":{"switch_set":false,"order":{"show":true,"check":false},"tag":{"show":true,"check":false},"envelop":{"show":true,"check":false},"rebate_cert":{"show":true,"check":false},"pick_order":{"show":false,"check":false},"trans_order":{"show":false,"check":false},"tag_mulit":{"show":false,"check":false}},"delivery_pos":{"switch_set":false,"position":"botm_trans"},"cash_own_broker":{"switch_set":false,"position":"mid_fee"},"optional_payment":{"options":["pay_billing","pay_arrival","pay_owed","pay_co_delivery","pay_free","pay_multi","pay_monthly","pay_credit"],"switch_set":false},"outgo_fee":{"switch_set":true,"show":["b_billing_f","b_fuel_card_f","b_receipt_f"],"hidden":["b_dr_name","b_dr_phone","b_tr_num","pickup_f","pickup_dr_name","pickup_dr_phone","pickup_tr_num","b_loc_tr_f","loc_tr_name","loc_tr_phone","tax","tax_r","tax_inc","b_insur_f","b_loc_misc_f","b_loc_name","b_loc_phone"]},"std_fee":{"switch_set":true,"show":["std_f","std_mn_f","std_mgr_name","std_trans_f","std_delivery_f","std_uld_f","std_uld_grp"],"hidden":["std_pickup_f"]},"transfer_fee":{"switch_set":true,"show":[],"hidden":["trans_type","dn_com_id","dn_mgr_id","std_trans_f","trans_f","trans_pay_mode","trans_all_f","trans_all_flag","trans_profit","trans_pickup_f","trans_in_wh_f","trans_delivery_f","trans_handling_f","trans_upstair_f","trans_misc_f","trans_f","trans_install_f","trans_pkg_f","trans_storage_f","trans_insurance","trans_pay_billing","trans_pay_arrival","trans_pay_owed","trans_pay_monthly","trans_pay_receipt","trans_pay_credit","trans_pay_co_delivery"]},"oinfo_show":{"text":"详情显示设置"},"tab_poke":{"switch_set":false,"show":["abolish","pre","split","settle_state","delivery_grant","receipt_grant"],"hidden":[]},"info_tabs":{"switch_set":false,"show":["stowage","sign","expense","norm","trans","pickup","delivery"],"hidden":[]},"trans_info":{"switch_set":false,"checked":false},"co_feature":{"text":"开单页功能设置"},"start_noedt":{"switch_set":false,"noedit":false},"entrust_check_enable":{"switch_set":true,"enalbed":false},"general_un_support":{"switch_set":true,"un_support":false},"send_must_in":{"switch_set":true,"isIn":false},"receive_must_in":{"switch_set":true,"isIn":false},"map_choose_enable":{"switch_set":true,"map_on":false},"person_phone_check":{"switch_set":false,"phoneCheck":false},"goods_serial_enable":{"switch_set":true,"serial_on":false},"trans_in_info":{"switch_set":true,"trans_on":false},"in_days":{"switch_set":true,"checked":true,"value":"365"},"when_order_repeat":{"switch_set":true,"value":"auto_up_by_rule"},"notice_to_release":{"switch_set":true,"value":["no_sign_down"]},"weight_to_volume":{"switch_set":false,"weight":"","volume":""},"co_def_val":{"text":"开单页默认值设置"},"start":{"switch_set":false,"value":{"adcode":"","city":"","district":"","poi":"","province":"","show_val":"888aaa"}},"num":{"switch_set":false,"value":"10"},"delivery_way":{"switch_set":false,"value":"self_pick"},"receipt_type":{"switch_set":false,"value":"receipt"},"receipt_num":{"switch_set":false,"value":"130"},"return_pay_num":{"switch_set":false,"value":"1"},"weight_unit":{"switch_set":false,"value":"KG"},"unit_price":{"switch_set":false,"value":"per_num"},"payment":{"switch_set":false,"value":"pay_multi"},"transport_type":{"switch_set":false,"value":"auto_trans"},"print_copies":{"switch_set":false,"value":"1"},"declare_value":{"switch_set":false,"value":"10"},"declare_remark":{"switch_set":false,"money":"","text":""},"payment_upon_last":{"switch_set":false,"checked":true},"mgr_upon_last":{"switch_set":false,"checked":true},"customer_info":{"text":"客户信息栏设置"},"cor_sug_show":{"switch_set":false,"cor_sug_show_val":["cor_com","cor_name","cor_mobile","cor_addr"]},"cee_sug_show":{"switch_set":false,"cee_sug_show_val":["cee_com","cee_mobile","cee_addr"]},"goods_info":{"text":"货物信息栏设置"},"goods_name":{"lock":false,"selc_value":[{"key":"100","name":"把"},{"key":"100","name":"明年"}],"switch_set":false},"pkg_name":{"lock":false,"selc_value":[{"key":"100","name":"图"},{"key":"100","name":"哦哟哟"}],"switch_set":false},"goods_cat":{"switch_set":false,"selc_value":[],"lock":false},"transport_info":{"text":"运输信息栏设置"},"delivery_need":{"switch_set":false,"value":["delivery_fee","delivery_fee","cee_adr","delivery_fee","cee_adr","delivery_fee","cee_adr","delivery_fee","cee_adr","delivery_fee","cee_adr","delivery_fee","cee_adr"]},"door_pick_need":{"switch_set":false,"value":["cor_adr","cor_adr","cor_adr","pick_fee","cor_adr","pick_fee","cor_adr","pick_fee","cor_adr","pick_fee","cor_adr","pick_fee","cor_adr"]},"transport_add":{"switch_set":false,"value":[{"key":"100","name":"头像"}]},"transport_remark":{"switch_set":false,"value":[],"lock":false},"delivery_0_delivery":{"switch_set":false,"checked":false},"delivery_0_load":{"switch_set":false,"checked":false},"delivery_0_upstairs":{"switch_set":false,"checked":false},"delivery_0_install":{"switch_set":false,"checked":false},"fee_info":{"text":"费用信息栏设置"},"total_calc":{"switch_set":false,"value":["co_freight_f","co_pickup_f","co_delivery_f","co_pay_adv","co_handling_f","co_delivery_f","co_install_f","co_pkg_f","co_in_wh_f","co_storage_f","co_misc_f","co_trans_f"]},"get_unit":{"switch_set":true,"value":["real"]},"decimal_price":{"switch_set":false,"checked":"manual","rate":"","calc_rule":"real","min":""},"commission":{"switch_set":false,"checked":"manual","rate":"","calc_rule":"real","min":""},"modify_order":{"text":"改单设置"},"modify_in_trans":{"switch_set":true,"checked":false},"arr_hide_info":{"text":"改单设置"}}
     * point_cost_info : {}
     * std_cost : {}
     * trans_info : {}
     * enum : {}
     * src : co
     */

    public int company_id;
    public String company_name;
    /**
     * billing_date : {"value":"2017-02-10 15:10:32","editable":true}
     * order_num : {"value":"08881117020033","editable":true}
     * order_creator : {"value":10942,"editable":false}
     * order_creator_name : {"value":"zhangsan_2","editable":false}
     * mgr_id : {"value":10942,"editable":true}
     * start_info : {"value":{"show_val":"测试区","province":"陕西省","city":"大同市","district":"测试区","adcode":"110105","poi":"116.443108,39.92147"},"editable":true}
     * base_enum : {"mgr_id_info":{"id":10942,"name":"李四111","telephone":"222222222"},"receipt_cat_info":{"display":"回单"}}
     */

    public OrderDataBean order_data;
    /**
     * order_setting : {"is_switch":false,"switch_set":false}
     * num_rule : []
     * order_num : {"switch_set":true,"checked":"custom","auto_by":"point","auto_no_moify":false,"cus_no_modify":false,"seq_figure":"","optional":{},"selected":{}}
     * goods_num : {"switch_set":true,"checked":"custom","no_moify":false,"set_rules":{}}
     * co_show : []
     * co_type : {}
     * show_type : {}
     * co1 : {"co":{"arr":{"required":true,"show":true},"billing_date":{"required":true,"show":true},"cashreturn":{"required":false,"show":false},"cat":{"required":false,"show":false},"co_delivery":{"required":false,"show":true},"co_delivery_adv":{"required":false,"show":false},"co_delivery_f":{"required":false,"show":true},"co_delivery_fee":{"required":false,"show":true},"co_freight_f":{"required":true,"show":true},"co_handling_f":{"required":false,"show":true},"co_in_wh_f":{"required":false,"show":false},"co_install_f":{"required":false,"show":false},"co_insurance":{"required":false,"show":true},"co_misc_f":{"required":false,"show":true},"co_pay_adv":{"required":false,"show":false},"co_pickup_f":{"required":false,"show":false},"co_pkg_f":{"required":false,"show":false},"co_storage_f":{"required":false,"show":false},"co_trans_f":{"required":false,"show":false},"co_upstairs_f":{"required":false,"show":false},"cor_cee_addr":{"required":false,"show":true},"cor_cee_area":{"required":false,"show":true},"cor_cee_com":{"required":false,"show":false},"cor_cee_id_num":{"required":false,"show":false},"cor_cee_mobile":{"required":false,"show":true},"cor_cee_name":{"required":true,"show":true},"cor_cee_phone":{"required":false,"show":false},"declared_value":{"required":false,"show":true},"delivery_mode":{"required":false,"show":true},"discount":{"required":false,"show":false},"entrust_num":{"required":false,"show":true},"goods_num":{"required":false,"show":true},"invoice":{"required":false,"show":false},"mgr_id":{"required":false,"show":false},"model":{"required":false,"show":false},"name":{"required":false,"show":true},"notice_delivery":{"required":false,"show":true},"num":{"required":false,"show":true},"order_creator_name":{"required":true,"show":true},"order_num":{"required":true,"show":true},"pay_arrival":{"required":false,"show":true},"pay_billing":{"required":false,"show":true},"pay_co_delivery":{"required":false,"show":true},"pay_credit":{"required":false,"show":true},"pay_mode":{"required":true,"show":true},"pay_monthly":{"required":false,"show":true},"pay_owed":{"required":false,"show":true},"pay_receipt":{"required":false,"show":true},"pick_dist":{"required":false,"show":false},"pickup":{"required":false,"show":false},"pkg":{"required":false,"show":false},"rcv_stn":{"required":false,"show":false},"rebate":{"required":false,"show":true},"receipt_cat":{"required":false,"show":true},"receipt_n":{"required":false,"show":true},"receipt_num":{"required":false,"show":false},"remark":{"required":false,"show":true},"route":{"required":true,"show":true},"shaped":{"required":false,"show":false},"shud_arr_date":{"required":false,"show":false},"sped":{"required":false,"show":false},"start":{"required":false,"show":true},"trsp_mode":{"required":false,"show":false},"unit_p":{"required":false,"show":true},"unit_p_unit":{"required":false,"show":true},"volume":{"required":false,"show":true},"weight":{"required":false,"show":false},"xpcd_arr_date":{"required":false,"show":true}},"switch_set":true}
     * empty_pre_order : {"switch_set":true,"order_n":{"show":true,"required":true},"order_num_range":{"show":true,"required":true},"cor_name":{"show":true,"required":false},"cor_mobile":{"show":true,"required":false},"cee_addr":{"show":true,"required":false},"cor_area":{"show":true,"required":false},"mgr_id":{"show":true,"required":false},"name":{"show":true,"required":false}}
     * tags_pre_order : {"switch_set":true,"order_num":{"show":true,"required":true},"goods_num":{"show":true,"required":false},"arr":{"show":true,"required":false},"cor_name":{"show":true,"required":false},"cor_mobile":{"show":true,"required":false},"cee_name":{"show":true,"required":false},"cee_mobile":{"show":true,"required":false},"name":{"show":true,"required":false},"num":{"show":true,"required":false},"weight":{"show":false,"required":false},"volume":{"show":false,"required":false},"co_freight_f":{"show":false,"required":false},"remark":{"show":false,"required":false}}
     * print_option : {"switch_set":false,"order":{"show":true,"check":false},"tag":{"show":true,"check":false},"envelop":{"show":true,"check":false},"rebate_cert":{"show":true,"check":false},"pick_order":{"show":false,"check":false},"trans_order":{"show":false,"check":false},"tag_mulit":{"show":false,"check":false}}
     * delivery_pos : {"switch_set":false,"position":"botm_trans"}
     * cash_own_broker : {"switch_set":false,"position":"mid_fee"}
     * optional_payment : {"options":["pay_billing","pay_arrival","pay_owed","pay_co_delivery","pay_free","pay_multi","pay_monthly","pay_credit"],"switch_set":false}
     * outgo_fee : {"switch_set":true,"show":["b_billing_f","b_fuel_card_f","b_receipt_f"],"hidden":["b_dr_name","b_dr_phone","b_tr_num","pickup_f","pickup_dr_name","pickup_dr_phone","pickup_tr_num","b_loc_tr_f","loc_tr_name","loc_tr_phone","tax","tax_r","tax_inc","b_insur_f","b_loc_misc_f","b_loc_name","b_loc_phone"]}
     * std_fee : {"switch_set":true,"show":["std_f","std_mn_f","std_mgr_name","std_trans_f","std_delivery_f","std_uld_f","std_uld_grp"],"hidden":["std_pickup_f"]}
     * transfer_fee : {"switch_set":true,"show":[],"hidden":["trans_type","dn_com_id","dn_mgr_id","std_trans_f","trans_f","trans_pay_mode","trans_all_f","trans_all_flag","trans_profit","trans_pickup_f","trans_in_wh_f","trans_delivery_f","trans_handling_f","trans_upstair_f","trans_misc_f","trans_f","trans_install_f","trans_pkg_f","trans_storage_f","trans_insurance","trans_pay_billing","trans_pay_arrival","trans_pay_owed","trans_pay_monthly","trans_pay_receipt","trans_pay_credit","trans_pay_co_delivery"]}
     * oinfo_show : {"text":"详情显示设置"}
     * tab_poke : {"switch_set":false,"show":["abolish","pre","split","settle_state","delivery_grant","receipt_grant"],"hidden":[]}
     * info_tabs : {"switch_set":false,"show":["stowage","sign","expense","norm","trans","pickup","delivery"],"hidden":[]}
     * trans_info : {"switch_set":false,"checked":false}
     * co_feature : {"text":"开单页功能设置"}
     * start_noedt : {"switch_set":false,"noedit":false}
     * entrust_check_enable : {"switch_set":true,"enalbed":false}
     * general_un_support : {"switch_set":true,"un_support":false}
     * send_must_in : {"switch_set":true,"isIn":false}
     * receive_must_in : {"switch_set":true,"isIn":false}
     * map_choose_enable : {"switch_set":true,"map_on":false}
     * person_phone_check : {"switch_set":false,"phoneCheck":false}
     * goods_serial_enable : {"switch_set":true,"serial_on":false}
     * trans_in_info : {"switch_set":true,"trans_on":false}
     * in_days : {"switch_set":true,"checked":true,"value":"365"}
     * when_order_repeat : {"switch_set":true,"value":"auto_up_by_rule"}
     * notice_to_release : {"switch_set":true,"value":["no_sign_down"]}
     * weight_to_volume : {"switch_set":false,"weight":"","volume":""}
     * co_def_val : {"text":"开单页默认值设置"}
     * start : {"switch_set":false,"value":{"adcode":"","city":"","district":"","poi":"","province":"","show_val":"888aaa"}}
     * num : {"switch_set":false,"value":"10"}
     * delivery_way : {"switch_set":false,"value":"self_pick"}
     * receipt_type : {"switch_set":false,"value":"receipt"}
     * receipt_num : {"switch_set":false,"value":"130"}
     * return_pay_num : {"switch_set":false,"value":"1"}
     * weight_unit : {"switch_set":false,"value":"KG"}
     * unit_price : {"switch_set":false,"value":"per_num"}
     * payment : {"switch_set":false,"value":"pay_multi"}
     * transport_type : {"switch_set":false,"value":"auto_trans"}
     * print_copies : {"switch_set":false,"value":"1"}
     * declare_value : {"switch_set":false,"value":"10"}
     * declare_remark : {"switch_set":false,"money":"","text":""}
     * payment_upon_last : {"switch_set":false,"checked":true}
     * mgr_upon_last : {"switch_set":false,"checked":true}
     * customer_info : {"text":"客户信息栏设置"}
     * cor_sug_show : {"switch_set":false,"cor_sug_show_val":["cor_com","cor_name","cor_mobile","cor_addr"]}
     * cee_sug_show : {"switch_set":false,"cee_sug_show_val":["cee_com","cee_mobile","cee_addr"]}
     * goods_info : {"text":"货物信息栏设置"}
     * goods_name : {"lock":false,"selc_value":[{"key":"100","name":"把"},{"key":"100","name":"明年"}],"switch_set":false}
     * pkg_name : {"lock":false,"selc_value":[{"key":"100","name":"图"},{"key":"100","name":"哦哟哟"}],"switch_set":false}
     * goods_cat : {"switch_set":false,"selc_value":[],"lock":false}
     * transport_info : {"text":"运输信息栏设置"}
     * delivery_need : {"switch_set":false,"value":["delivery_fee","delivery_fee","cee_adr","delivery_fee","cee_adr","delivery_fee","cee_adr","delivery_fee","cee_adr","delivery_fee","cee_adr","delivery_fee","cee_adr"]}
     * door_pick_need : {"switch_set":false,"value":["cor_adr","cor_adr","cor_adr","pick_fee","cor_adr","pick_fee","cor_adr","pick_fee","cor_adr","pick_fee","cor_adr","pick_fee","cor_adr"]}
     * transport_add : {"switch_set":false,"value":[{"key":"100","name":"头像"}]}
     * transport_remark : {"switch_set":false,"value":[],"lock":false}
     * delivery_0_delivery : {"switch_set":false,"checked":false}
     * delivery_0_load : {"switch_set":false,"checked":false}
     * delivery_0_upstairs : {"switch_set":false,"checked":false}
     * delivery_0_install : {"switch_set":false,"checked":false}
     * fee_info : {"text":"费用信息栏设置"}
     * total_calc : {"switch_set":false,"value":["co_freight_f","co_pickup_f","co_delivery_f","co_pay_adv","co_handling_f","co_delivery_f","co_install_f","co_pkg_f","co_in_wh_f","co_storage_f","co_misc_f","co_trans_f"]}
     * get_unit : {"switch_set":true,"value":["real"]}
     * decimal_price : {"switch_set":false,"checked":"manual","rate":"","calc_rule":"real","min":""}
     * commission : {"switch_set":false,"checked":"manual","rate":"","calc_rule":"real","min":""}
     * modify_order : {"text":"改单设置"}
     * modify_in_trans : {"switch_set":true,"checked":false}
     * arr_hide_info : {"text":"改单设置"}
     */

    public CoSettingBean co_setting;
    public PointCostInfoBean point_cost_info;
    public StdCostBean std_cost;
    public TransInfoBean trans_info;
    @SerializedName("enum")
    public EnumBean enumX;
    public String src;


    /**
     * ext : {"src_transit_shed_list":[{"id":1419,"company_name":"","company_code":"6666","short_name":""}]}
     */

    public ExtBean ext;
    /**
     * fn_formula : {"formulaDt":[{"operator":"add","itemList":["total_price"],"ratio":"1"},{"operator":"minus","itemList":["cashreturn"],"ratio":"1"},{"operator":"minus","itemList":["discount"],"ratio":"1"},{"operator":"minus","itemList":["rebate"],"ratio":"1"}]}
     */
    public FinanceSettingBean finance_setting;
    /**
     * cut_payment_set : {"default_price_pattern":{"can_switch":false,"switch_set":true,"value":""}}
     */

    public CutPaymentSetBean cut_payment_set;

    public static class ExtBean {
        public List<SrcTransitShedListBean> src_transit_shed_list;

        public static ExtBean objectFromData(String str) {

            return new Gson().fromJson(str, ExtBean.class);
        }

        public static class SrcTransitShedListBean {
            /**
             * id : 1419
             * company_name :
             * company_code : 6666
             * short_name :
             */

            public String id;
            public String company_name;
            public String company_code;
            public String short_name;

            public static SrcTransitShedListBean objectFromData(String str) {

                return new Gson().fromJson(str, SrcTransitShedListBean.class);
            }
        }
    }

    public static CoSetting objectFromData(String str) {

//        return new Gson().fromJson(str, CoSetting.class);
        return MGson.newGson().fromJson(str, CoSetting.class);
    }

    public static class OrderDataBean {
        @Override
        public String toString() {
            return "OrderDataBean{" +
                    "billing_date=" + billing_date +
                    ", order_num=" + order_num +
                    ", goods_num=" + goods_num +
                    ", order_creator=" + order_creator +
                    ", order_creator_name=" + order_creator_name +
                    ", mgr_id=" + mgr_id +
                    ", start_info=" + start_info +
                    ", base_enum=" + base_enum +
                    '}';
        }

        /**
         * value : 2017-02-10 15:10:32
         * editable : true
         */

        public DataEditableBean billing_date;
        /**
         * value : 08881117020033
         * editable : true
         */

        public DataEditableBean order_num;
        public DataEditableBean goods_num;
        /**
         * value : 10942
         * editable : false
         */

        public DataEditableBean order_creator;
        /**
         * value : zhangsan_2
         * editable : false
         */

        public DataEditableBean order_creator_name;
        /**
         * value : 10942
         * editable : true
         */

        public DataEditableBean mgr_id;
        /**
         * value : {"show_val":"测试区","province":"陕西省","city":"大同市","district":"测试区","adcode":"110105","poi":"116.443108,39.92147"}
         * editable : true
         */

        public StartInfoBean start_info;
        /**
         * mgr_id_info : {"id":10942,"name":"李四111","telephone":"222222222"}
         * receipt_cat_info : {"display":"回单"}
         */

        public BaseEnumBean base_enum;

        public static OrderDataBean objectFromData(String str) {

            return new Gson().fromJson(str, OrderDataBean.class);
        }

        public static class DataEditableBean {
            public String value;
            public boolean editable;

            public static DataEditableBean objectFromData(String str) {

                return new Gson().fromJson(str, DataEditableBean.class);
            }
        }

        public static class StartInfoBean {
            /**
             * show_val : 测试区
             * province : 陕西省
             * city : 大同市
             * district : 测试区
             * adcode : 110105
             * poi : 116.443108,39.92147
             */

            public ValueBean value;
            public boolean editable;

            public static StartInfoBean objectFromData(String str) {

                return new Gson().fromJson(str, StartInfoBean.class);
            }

            public static class ValueBean {
                public String show_val;
                public String province;
                public String city;
                public String district;
                public String adcode;
                public String poi;

                public static ValueBean objectFromData(String str) {

                    return new Gson().fromJson(str, ValueBean.class);
                }
            }
        }

        public static class BaseEnumBean {
            /**
             * id : 10942
             * name : 李四111
             * telephone : 222222222
             */

            public MgrIdInfoBean mgr_id_info;
            public StartPointBean start_point;
            /**
             * display : 回单
             */

            public ReceiptCatInfoBean receipt_cat_info;

            public static BaseEnumBean objectFromData(String str) {

                return new Gson().fromJson(str, BaseEnumBean.class);
            }

            public static class MgrIdInfoBean {
                public int id;
                public String name;
                public String telephone;

                public static MgrIdInfoBean objectFromData(String str) {

                    return new Gson().fromJson(str, MgrIdInfoBean.class);
                }
            }

            public static class StartPointBean {
                public String id;
                public String short_name;

                public static StartPointBean objectFromData(String str) {

                    return new Gson().fromJson(str, StartPointBean.class);
                }
            }

            public static class ReceiptCatInfoBean {
                public String display;

                public static ReceiptCatInfoBean objectFromData(String str) {

                    return new Gson().fromJson(str, ReceiptCatInfoBean.class);
                }
            }
        }
    }

    public static class FinanceSettingBean{
        public FnFormulaBean fn_formula;

        public static FinanceSettingBean objectFromData(String str) {

            return new Gson().fromJson(str, FinanceSettingBean.class);
        }
    }

    public static class CoSettingBean {
        @Override
        public String toString() {
            return "CoSettingBean{" +
                    "order_setting=" + order_setting +
                    ", order_num=" + order_num +
                    ", goods_num=" + goods_num +
                    ", co=" + co +
                    ", empty_pre_order=" + empty_pre_order +
                    ", tags_pre_order=" + tags_pre_order +
                    ", print_option=" + print_option +
                    ", delivery_pos=" + delivery_pos +
                    ", cash_own_broker=" + cash_own_broker +
                    ", optional_payment=" + optional_payment +
                    ", outgo_fee=" + outgo_fee +
                    ", std_fee=" + std_fee +
                    ", transfer_fee=" + transfer_fee +
                    ", oinfo_show=" + oinfo_show +
                    ", tab_poke=" + tab_poke +
                    ", info_tabs=" + info_tabs +
                    ", trans_info=" + trans_info +
                    ", co_feature=" + co_feature +
                    ", start_noedt=" + start_noedt +
                    ", entrust_check_enable=" + entrust_check_enable +
                    ", general_un_support=" + general_un_support +
                    ", send_must_in=" + send_must_in +
                    ", receive_must_in=" + receive_must_in +
                    ", map_choose_enable=" + map_choose_enable +
                    ", person_phone_check=" + person_phone_check +
                    ", goods_serial_enable=" + goods_serial_enable +
                    ", trans_in_info=" + trans_in_info +
                    ", in_days=" + in_days +
                    ", when_order_repeat=" + when_order_repeat +
                    ", notice_to_release=" + notice_to_release +
                    ", weight_to_volume=" + weight_to_volume +
                    ", co_def_val=" + co_def_val +
                    ", num=" + num +
                    ", delivery_way=" + delivery_way +
                    ", receipt_type=" + receipt_type +
                    ", receipt_num=" + receipt_num +
                    ", return_pay_num=" + return_pay_num +
                    ", weight_unit=" + weight_unit +
                    ", unit_price=" + unit_price +
                    ", payment=" + payment +
                    ", transport_type=" + transport_type +
                    ", print_copies=" + print_copies +
                    ", declare_value=" + declare_value +
                    ", declare_remark=" + declare_remark +
                    ", payment_upon_last=" + payment_upon_last +
                    ", mgr_upon_last=" + mgr_upon_last +
                    ", customer_info=" + customer_info +
                    ", cor_sug_show=" + cor_sug_show +
                    ", cee_sug_show=" + cee_sug_show +
                    ", goods_info=" + goods_info +
                    ", goods_name=" + goods_name +
                    ", pkg_name=" + pkg_name +
                    ", goods_cat=" + goods_cat +
                    ", transport_info=" + transport_info +
                    ", delivery_need=" + delivery_need +
                    ", door_pick_need=" + door_pick_need +
                    ", transport_add=" + transport_add +
                    ", transport_remark=" + transport_remark +
                    ", delivery_0_delivery=" + delivery_0_delivery +
                    ", delivery_0_load=" + delivery_0_load +
                    ", delivery_0_upstairs=" + delivery_0_upstairs +
                    ", delivery_0_install=" + delivery_0_install +
                    ", fee_info=" + fee_info +
                    ", total_calc=" + total_calc +
                    ", decimal_price=" + decimal_price +
                    ", commission=" + commission +
                    ", modify_order=" + modify_order +
                    ", modify_in_trans=" + modify_in_trans +
                    ", arr_hide_info=" + arr_hide_info +
                    '}';
        }

        /**
         * is_switch : false
         * switch_set : false
         */

        public OrderSettingBean order_setting;
        /**
         * switch_set : true
         * checked : custom
         * auto_by : point
         * auto_no_moify : false
         * cus_no_modify : false
         * seq_figure :
         * optional : {}
         * selected : {}
         */

        public OrderNumBean order_num;
        /**
         * switch_set : true
         * checked : custom
         * no_moify : false
         * set_rules : {}
         */

        public GoodsNumBean goods_num;
        /**
         * co : {"arr":{"required":true,"show":true},"billing_date":{"required":true,"show":true},"cashreturn":{"required":false,"show":false},"cat":{"required":false,"show":false},"co_delivery":{"required":false,"show":true},"co_delivery_adv":{"required":false,"show":false},"co_delivery_f":{"required":false,"show":true},"co_delivery_fee":{"required":false,"show":true},"co_freight_f":{"required":true,"show":true},"co_handling_f":{"required":false,"show":true},"co_in_wh_f":{"required":false,"show":false},"co_install_f":{"required":false,"show":false},"co_insurance":{"required":false,"show":true},"co_misc_f":{"required":false,"show":true},"co_pay_adv":{"required":false,"show":false},"co_pickup_f":{"required":false,"show":false},"co_pkg_f":{"required":false,"show":false},"co_storage_f":{"required":false,"show":false},"co_trans_f":{"required":false,"show":false},"co_upstairs_f":{"required":false,"show":false},"cor_cee_addr":{"required":false,"show":true},"cor_cee_area":{"required":false,"show":true},"cor_cee_com":{"required":false,"show":false},"cor_cee_id_num":{"required":false,"show":false},"cor_cee_mobile":{"required":false,"show":true},"cor_cee_name":{"required":true,"show":true},"cor_cee_phone":{"required":false,"show":false},"declared_value":{"required":false,"show":true},"delivery_mode":{"required":false,"show":true},"discount":{"required":false,"show":false},"entrust_num":{"required":false,"show":true},"goods_num":{"required":false,"show":true},"invoice":{"required":false,"show":false},"mgr_id":{"required":false,"show":false},"model":{"required":false,"show":false},"name":{"required":false,"show":true},"notice_delivery":{"required":false,"show":true},"num":{"required":false,"show":true},"order_creator_name":{"required":true,"show":true},"order_num":{"required":true,"show":true},"pay_arrival":{"required":false,"show":true},"pay_billing":{"required":false,"show":true},"pay_co_delivery":{"required":false,"show":true},"pay_credit":{"required":false,"show":true},"pay_mode":{"required":true,"show":true},"pay_monthly":{"required":false,"show":true},"pay_owed":{"required":false,"show":true},"pay_receipt":{"required":false,"show":true},"pick_dist":{"required":false,"show":false},"pickup":{"required":false,"show":false},"pkg":{"required":false,"show":false},"rcv_stn":{"required":false,"show":false},"rebate":{"required":false,"show":true},"receipt_cat":{"required":false,"show":true},"receipt_n":{"required":false,"show":true},"receipt_num":{"required":false,"show":false},"remark":{"required":false,"show":true},"route":{"required":true,"show":true},"shaped":{"required":false,"show":false},"shud_arr_date":{"required":false,"show":false},"sped":{"required":false,"show":false},"start":{"required":false,"show":true},"trsp_mode":{"required":false,"show":false},"unit_p":{"required":false,"show":true},"unit_p_unit":{"required":false,"show":true},"volume":{"required":false,"show":true},"weight":{"required":false,"show":false},"xpcd_arr_date":{"required":false,"show":true}}
         * switch_set : true
         */

        public Co1Bean co;
        /**
         * switch_set : true
         * order_n : {"show":true,"required":true}
         * order_num_range : {"show":true,"required":true}
         * cor_name : {"show":true,"required":false}
         * cor_mobile : {"show":true,"required":false}
         * cee_addr : {"show":true,"required":false}
         * cor_area : {"show":true,"required":false}
         * mgr_id : {"show":true,"required":false}
         * name : {"show":true,"required":false}
         */

        public EmptyPreOrderBean empty_pre_order;
        /**
         * switch_set : true
         * order_num : {"show":true,"required":true}
         * goods_num : {"show":true,"required":false}
         * arr : {"show":true,"required":false}
         * cor_name : {"show":true,"required":false}
         * cor_mobile : {"show":true,"required":false}
         * cee_name : {"show":true,"required":false}
         * cee_mobile : {"show":true,"required":false}
         * name : {"show":true,"required":false}
         * num : {"show":true,"required":false}
         * weight : {"show":false,"required":false}
         * volume : {"show":false,"required":false}
         * co_freight_f : {"show":false,"required":false}
         * remark : {"show":false,"required":false}
         */

        public TagsPreOrderBean tags_pre_order;
        /**
         * switch_set : false
         * order : {"show":true,"check":false}
         * tag : {"show":true,"check":false}
         * envelop : {"show":true,"check":false}
         * rebate_cert : {"show":true,"check":false}
         * pick_order : {"show":false,"check":false}
         * trans_order : {"show":false,"check":false}
         * tag_mulit : {"show":false,"check":false}
         */

        public PrintOptionBean print_option;
        /**
         * switch_set : false
         * position : botm_trans
         */

        public DeliveryPosBean delivery_pos;
        /**
         * switch_set : false
         * position : mid_fee
         */

        public CashOwnBrokerBean cash_own_broker;
        /**
         * options : ["pay_billing","pay_arrival","pay_owed","pay_co_delivery","pay_free","pay_multi","pay_monthly","pay_credit"]
         * switch_set : false
         */

        public OptionalPaymentBean optional_payment;
        /**
         * switch_set : true
         * show : ["b_billing_f","b_fuel_card_f","b_receipt_f"]
         * hidden : ["b_dr_name","b_dr_phone","b_tr_num","pickup_f","pickup_dr_name","pickup_dr_phone","pickup_tr_num","b_loc_tr_f","loc_tr_name","loc_tr_phone","tax","tax_r","tax_inc","b_insur_f","b_loc_misc_f","b_loc_name","b_loc_phone"]
         */

        public OutgoFeeBean outgo_fee;
        /**
         * switch_set : true
         * show : ["std_f","std_mn_f","std_mgr_name","std_trans_f","std_delivery_f","std_uld_f","std_uld_grp"]
         * hidden : ["std_pickup_f"]
         */

        public StdFeeBean std_fee;
        /**
         * switch_set : true
         * show : []
         * hidden : ["trans_type","dn_com_id","dn_mgr_id","std_trans_f","trans_f","trans_pay_mode","trans_all_f","trans_all_flag","trans_profit","trans_pickup_f","trans_in_wh_f","trans_delivery_f","trans_handling_f","trans_upstair_f","trans_misc_f","trans_f","trans_install_f","trans_pkg_f","trans_storage_f","trans_insurance","trans_pay_billing","trans_pay_arrival","trans_pay_owed","trans_pay_monthly","trans_pay_receipt","trans_pay_credit","trans_pay_co_delivery"]
         */

        public TransferFeeBean transfer_fee;
        /**
         * text : 详情显示设置
         */

        public OinfoShowBean oinfo_show;
        /**
         * switch_set : false
         * show : ["abolish","pre","split","settle_state","delivery_grant","receipt_grant"]
         * hidden : []
         */

        public TabPokeBean tab_poke;
        /**
         * switch_set : false
         * show : ["stowage","sign","expense","norm","trans","pickup","delivery"]
         * hidden : []
         */

        public InfoTabsBean info_tabs;
        /**
         * switch_set : false
         * checked : false
         */

        public TransInfoBean trans_info;
        /**
         * text : 开单页功能设置
         */

        public CoFeatureBean co_feature;
        /**
         * switch_set : false
         * noedit : false
         */

        public StartNoedtBean start_noedt;
        /**
         * switch_set : true
         * enalbed : false
         */

        public EntrustCheckEnableBean entrust_check_enable;
        /**
         * switch_set : true
         * un_support : false
         */

        public GeneralUnSupportBean general_un_support;
        /**
         * switch_set : true
         * isIn : false
         */

        public SendMustInBean send_must_in;
        /**
         * switch_set : true
         * isIn : false
         */

        public ReceiveMustInBean receive_must_in;
        /**
         * switch_set : true
         * map_on : false
         */

        public MapChooseEnableBean map_choose_enable;
        /**
         * switch_set : false
         * phoneCheck : false
         */

        public PersonPhoneCheckBean person_phone_check;
        /**
         * switch_set : true
         * serial_on : false
         */

        public GoodsSerialEnableBean goods_serial_enable;
        /**
         * switch_set : true
         * trans_on : false
         */

        public TransInInfoBean trans_in_info;
        /**
         * switch_set : true
         * checked : true
         * value : 365
         */

        public InDaysBean in_days;
        /**
         * switch_set : true
         * value : auto_up_by_rule
         */

        public WhenOrderRepeatBean when_order_repeat;
        /**
         * switch_set : true
         * value : ["no_sign_down"]
         */

        public NoticeToReleaseBean notice_to_release;
        /**
         * switch_set : false
         * weight :
         * volume :
         */

        public WeightToVolumeBean weight_to_volume;
        /**
         * text : 开单页默认值设置
         */

        public CoDefValBean co_def_val;
        /**
         * switch_set : false
         * value : {"adcode":"","city":"","district":"","poi":"","province":"","show_val":"888aaa"}
         */

//        public StartBean start;
        /**
         * switch_set : false
         * value : 10
         */

        public NumBean num;
        /**
         * switch_set : false
         * value : self_pick
         */

        public DeliveryWayBean delivery_way;
        /**
         * switch_set : false
         * value : receipt
         */

        public ReceiptTypeBean receipt_type;
        /**
         * switch_set : false
         * value : 130
         */

        public ReceiptNumBean receipt_num = new ReceiptNumBean();
        /**
         * switch_set : false
         * value : 1
         */

        public ReturnPayNumBean return_pay_num;
        /**
         * switch_set : false
         * value : KG
         */

        public WeightUnitBean weight_unit;
        /**
         * switch_set : false
         * value : per_num
         */

        public UnitPriceBean unit_price;
        /**
         * switch_set : false
         * value : pay_multi
         */

        public PaymentBean payment;
        /**
         * switch_set : false
         * value : auto_trans
         */

        public TransportTypeBean transport_type;
        /**
         * switch_set : false
         * value : 1
         */

        public PrintCopiesBean print_copies;
        /**
         * switch_set : false
         * value : 10
         */

        public DeclareValueBean declare_value;
        /**
         * switch_set : false
         * money :
         * text :
         */

        public DeclareRemarkBean declare_remark;
        /**
         * switch_set : false
         * checked : true
         */

        public PaymentUponLastBean payment_upon_last;
        /**
         * switch_set : false
         * checked : true
         */

        public MgrUponLastBean mgr_upon_last;
        /**
         * text : 客户信息栏设置
         */

        public CustomerInfoBean customer_info;
        /**
         * switch_set : false
         * cor_sug_show_val : ["cor_com","cor_name","cor_mobile","cor_addr"]
         */

        public CorSugShowBean cor_sug_show;
        /**
         * switch_set : false
         * cee_sug_show_val : ["cee_com","cee_mobile","cee_addr"]
         */

        public CeeSugShowBean cee_sug_show;
        /**
         * text : 货物信息栏设置
         */

        public GoodsInfoBean goods_info;
        /**
         * lock : false
         * selc_value : [{"key":"100","name":"把"},{"key":"100","name":"明年"}]
         * switch_set : false
         */

        public GoodsNameBean goods_name;
        /**
         * lock : false
         * selc_value : [{"key":"100","name":"图"},{"key":"100","name":"哦哟哟"}]
         * switch_set : false
         */

        public PkgNameBean pkg_name;
        /**
         * switch_set : false
         * selc_value : []
         * lock : false
         */

        public GoodsCatBean goods_cat;
        /**
         * text : 运输信息栏设置
         */

        public TransportInfoBean transport_info;
        /**
         * switch_set : false
         * value : ["delivery_fee","delivery_fee","cee_adr","delivery_fee","cee_adr","delivery_fee","cee_adr","delivery_fee","cee_adr","delivery_fee","cee_adr","delivery_fee","cee_adr"]
         */

        public DeliveryNeedBean delivery_need;
        /**
         * switch_set : false
         * value : ["cor_adr","cor_adr","cor_adr","pick_fee","cor_adr","pick_fee","cor_adr","pick_fee","cor_adr","pick_fee","cor_adr","pick_fee","cor_adr"]
         */

        public DoorPickNeedBean door_pick_need;
        /**
         * switch_set : false
         * value : [{"key":"100","name":"头像"}]
         */

        public TransportAddBean transport_add;
        /**
         * switch_set : false
         * value : []
         * lock : false
         */

        public TransportRemarkBean transport_remark;
        /**
         * switch_set : false
         * checked : false
         */

        public Delivery0DeliveryBean delivery_0_delivery;
        /**
         * switch_set : false
         * checked : false
         */

        public Delivery0LoadBean delivery_0_load;
        /**
         * switch_set : false
         * checked : false
         */

        public Delivery0UpstairsBean delivery_0_upstairs;
        /**
         * switch_set : false
         * checked : false
         */

        public Delivery0InstallBean delivery_0_install;
        /**
         * text : 费用信息栏设置
         */

        public FeeInfoBean fee_info;
        /**
         * switch_set : false
         * value : ["co_freight_f","co_pickup_f","co_delivery_f","co_pay_adv","co_handling_f","co_delivery_f","co_install_f","co_pkg_f","co_in_wh_f","co_storage_f","co_misc_f","co_trans_f"]
         */

        public TotalCalcBean total_calc;
        /**
         * switch_set : true
         * value : ["real"]
         */

//        public GetUnitBean get_unit;
        /**
         * switch_set : false
         * checked : manual
         * rate :
         * calc_rule : real
         * min :
         */

        public DecimalPriceBean decimal_price;
        /**
         * switch_set : false
         * checked : manual
         * rate :
         * calc_rule : real
         * min :
         */

        public CommissionBean commission;
        /**
         * text : 改单设置
         */

        public ModifyOrderBean modify_order;
        /**
         * switch_set : true
         * checked : false
         */

        public ModifyInTransBean modify_in_trans;
        /**
         * text : 改单设置
         */

        public ArrHideInfoBean arr_hide_info;

        public static CoSettingBean objectFromData(String str) {

            return new Gson().fromJson(str, CoSettingBean.class);
        }

        public static class OrderSettingBean {
            public boolean is_switch;
            public boolean switch_set;

            public static OrderSettingBean objectFromData(String str) {

                return new Gson().fromJson(str, OrderSettingBean.class);
            }
        }

        public static class OrderNumBean {
            public boolean switch_set;
            public String checked;
            public String auto_by;
            public boolean auto_no_moify;
            public boolean cus_no_modify;
            public String seq_figure;
            public OptionalBean optional;
//            public SelectedBean selected;

            public static OrderNumBean objectFromData(String str) {

                return new Gson().fromJson(str, OrderNumBean.class);
            }

            public static class OptionalBean {
                public static OptionalBean objectFromData(String str) {

                    return new Gson().fromJson(str, OptionalBean.class);
                }
            }

            public static class SelectedBean {
                public static SelectedBean objectFromData(String str) {

                    return new Gson().fromJson(str, SelectedBean.class);
                }
            }
        }

        public static class GoodsNumBean {
            public String checked;
            public static GoodsNumBean objectFromData(String str) {

                return new Gson().fromJson(str, GoodsNumBean.class);
            }
        }

        public static class Co1Bean {
            /**
             * arr : {"required":true,"show":true}
             * billing_date : {"required":true,"show":true}
             * cashreturn : {"required":false,"show":false}
             * cat : {"required":false,"show":false}
             * co_delivery : {"required":false,"show":true}
             * co_delivery_adv : {"required":false,"show":false}
             * co_delivery_f : {"required":false,"show":true}
             * co_delivery_fee : {"required":false,"show":true}
             * co_freight_f : {"required":true,"show":true}
             * co_handling_f : {"required":false,"show":true}
             * co_in_wh_f : {"required":false,"show":false}
             * co_install_f : {"required":false,"show":false}
             * co_insurance : {"required":false,"show":true}
             * co_misc_f : {"required":false,"show":true}
             * co_pay_adv : {"required":false,"show":false}
             * co_pickup_f : {"required":false,"show":false}
             * co_pkg_f : {"required":false,"show":false}
             * co_storage_f : {"required":false,"show":false}
             * co_trans_f : {"required":false,"show":false}
             * co_upstairs_f : {"required":false,"show":false}
             * cor_cee_addr : {"required":false,"show":true}
             * cor_cee_area : {"required":false,"show":true}
             * cor_cee_com : {"required":false,"show":false}
             * cor_cee_id_num : {"required":false,"show":false}
             * cor_cee_mobile : {"required":false,"show":true}
             * cor_cee_name : {"required":true,"show":true}
             * cor_cee_phone : {"required":false,"show":false}
             * declared_value : {"required":false,"show":true}
             * delivery_mode : {"required":false,"show":true}
             * discount : {"required":false,"show":false}
             * entrust_num : {"required":false,"show":true}
             * goods_num : {"required":false,"show":true}
             * invoice : {"required":false,"show":false}
             * mgr_id : {"required":false,"show":false}
             * model : {"required":false,"show":false}
             * name : {"required":false,"show":true}
             * notice_delivery : {"required":false,"show":true}
             * num : {"required":false,"show":true}
             * order_creator_name : {"required":true,"show":true}
             * order_num : {"required":true,"show":true}
             * pay_arrival : {"required":false,"show":true}
             * pay_billing : {"required":false,"show":true}
             * pay_co_delivery : {"required":false,"show":true}
             * pay_credit : {"required":false,"show":true}
             * pay_mode : {"required":true,"show":true}
             * pay_monthly : {"required":false,"show":true}
             * pay_owed : {"required":false,"show":true}
             * pay_receipt : {"required":false,"show":true}
             * pick_dist : {"required":false,"show":false}
             * pickup : {"required":false,"show":false}
             * pkg : {"required":false,"show":false}
             * rcv_stn : {"required":false,"show":false}
             * rebate : {"required":false,"show":true}
             * receipt_cat : {"required":false,"show":true}
             * receipt_n : {"required":false,"show":true}
             * receipt_num : {"required":false,"show":false}
             * remark : {"required":false,"show":true}
             * route : {"required":true,"show":true}
             * shaped : {"required":false,"show":false}
             * shud_arr_date : {"required":false,"show":false}
             * sped : {"required":false,"show":false}
             * start : {"required":false,"show":true}
             * trsp_mode : {"required":false,"show":false}
             * unit_p : {"required":false,"show":true}
             * unit_p_unit : {"required":false,"show":true}
             * volume : {"required":false,"show":true}
             * weight : {"required":false,"show":false}
             * xpcd_arr_date : {"required":false,"show":true}
             */

            public CoBean co;
            public boolean switch_set;

            public static Co1Bean objectFromData(String str) {

                return new Gson().fromJson(str, Co1Bean.class);
            }

            public static class CoBean {
                /**
                 * required : true
                 * show : true
                 */

                public CoVisibleBean arr;
                public CoVisibleBean arr_point;
                /**
                 * required : true
                 * show : true
                 */

                public CoVisibleBean billing_date;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean cashreturn;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean cat;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean co_delivery;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean co_delivery_adv;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean co_delivery_f;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean co_delivery_fee;
                /**
                 * required : true
                 * show : true
                 */

                public CoVisibleBean co_freight_f;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean co_handling_f;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean co_in_wh_f;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean co_install_f;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean co_insurance;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean co_misc_f;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean co_pay_adv;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean co_pickup_f;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean co_pkg_f;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean co_storage_f;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean co_trans_f;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean co_upstairs_f;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean cor_cee_addr;
                public CoVisibleBean cor_id_num = new CoVisibleBean();
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean cor_cee_area;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean cor_cee_com;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean cor_cee_id_num;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean cor_cee_mobile;
                /**
                 * required : true
                 * show : true
                 */

                public CoVisibleBean cor_cee_name;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean cor_cee_phone;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean declared_value;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean delivery_mode;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean discount;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean entrust_num;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean goods_num;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean invoice;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean mgr_id;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean model;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean name;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean notice_delivery = new CoVisibleBean();
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean num;
                /**
                 * required : true
                 * show : true
                 */

                public CoVisibleBean order_creator_name;
                /**
                 * required : true
                 * show : true
                 */

//                public OrderNumBean order_num;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean pay_arrival;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean pay_billing;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean pay_co_delivery;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean pay_credit;
                /**
                 * required : true
                 * show : true
                 */

                public CoVisibleBean pay_mode;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean pay_monthly;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean pay_owed;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean pay_receipt;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean pick_dist;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean pickup;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean pkg;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean rcv_stn;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean rebate;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean receipt_cat;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean receipt_n;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean receipt_num;
                public CoVisibleBean receipt_info;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean remark;
                /**
                 * required : true
                 * show : true
                 */

                public CoVisibleBean route;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean shaped;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean shud_arr_date;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean sped;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean start;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean trsp_mode;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean unit_p;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean unit_p_unit;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean volume;
                /**
                 * required : false
                 * show : false
                 */

                public CoVisibleBean weight;
                /**
                 * required : false
                 * show : true
                 */

                public CoVisibleBean xpcd_arr_date;

                public static CoBean objectFromData(String str) {

                    return new Gson().fromJson(str, CoBean.class);
                }
            }
        }

        public static class EmptyPreOrderBean {
            public boolean switch_set;
            /**
             * show : true
             * required : true
             */

            public CoVisibleBean order_n;
            /**
             * show : true
             * required : true
             */

            public CoVisibleBean order_num_range;
            /**
             * show : true
             * required : false
             */

            public CoVisibleBean cor_name;
            /**
             * show : true
             * required : false
             */

            public CoVisibleBean cor_mobile;
            /**
             * show : true
             * required : false
             */

            public CoVisibleBean cee_addr;
            /**
             * show : true
             * required : false
             */

            public CoVisibleBean cor_area;
            /**
             * show : true
             * required : false
             */

            public CoVisibleBean mgr_id;
            /**
             * show : true
             * required : false
             */

            public CoVisibleBean name;

            public static EmptyPreOrderBean objectFromData(String str) {

                return new Gson().fromJson(str, EmptyPreOrderBean.class);
            }
        }

        public static class TagsPreOrderBean {
            public boolean switch_set;

            public TagsPre tags_pre;

            public static TagsPreOrderBean objectFromData(String str) {

                return new Gson().fromJson(str, TagsPreOrderBean.class);
            }

            public static class TagsPre{
                public CoVisibleBean goods_num;
                public CoVisibleBean start;
                public CoVisibleBean arr;
                public CoVisibleBean route;
                public CoVisibleBean cor_com;
                public CoVisibleBean cor_name;
                public CoVisibleBean cor_mobile;
                public CoVisibleBean cor_phone;
                public CoVisibleBean cor_addr;
                public CoVisibleBean cor_area;
                public CoVisibleBean cee_com;
                public CoVisibleBean cee_name;
                public CoVisibleBean cee_mobile;
                public CoVisibleBean cee_phone;
                public CoVisibleBean cee_addr;
                public CoVisibleBean cee_area;
                public CoVisibleBean name;
                public CoVisibleBean pkg;
                public CoVisibleBean num;
                public CoVisibleBean weight;
                public CoVisibleBean volume;
                public CoVisibleBean unit_p;
                public CoVisibleBean cat;
                public CoVisibleBean sped;
                public CoVisibleBean model;
                public CoVisibleBean shaped;
                public CoVisibleBean co_freight_f;
                public CoVisibleBean remark;
                public CoVisibleBean mgr_id;

                public static TagsPre objectFromData(String str) {

                    return new Gson().fromJson(str, TagsPre.class);
                }
            }
        }



        public static class PrintOptionBean {
            public boolean switch_set;
            /**
             * show : true
             * check : false
             */

            public OrderBean order;
            /**
             * show : true
             * check : false
             */

            public TagBean tag;
            /**
             * show : true
             * check : false
             */

            public EnvelopBean envelop;
            /**
             * show : true
             * check : false
             */

            public RebateCertBean rebate_cert;
            /**
             * show : false
             * check : false
             */

            public PickOrderBean pick_order;
            /**
             * show : false
             * check : false
             */

            public TransOrderBean trans_order;
            /**
             * show : false
             * check : false
             */

            public TagMulitBean tag_mulit;

            public static PrintOptionBean objectFromData(String str) {

                return new Gson().fromJson(str, PrintOptionBean.class);
            }

            public static class OrderBean {
                public boolean show;
                public boolean check;

                public static OrderBean objectFromData(String str) {

                    return new Gson().fromJson(str, OrderBean.class);
                }
            }

            public static class TagBean {
                public boolean show;
                public boolean check;

                public static TagBean objectFromData(String str) {

                    return new Gson().fromJson(str, TagBean.class);
                }
            }

            public static class EnvelopBean {
                public boolean show;
                public boolean check;

                public static EnvelopBean objectFromData(String str) {

                    return new Gson().fromJson(str, EnvelopBean.class);
                }
            }

            public static class RebateCertBean {
                public boolean show;
                public boolean check;

                public static RebateCertBean objectFromData(String str) {

                    return new Gson().fromJson(str, RebateCertBean.class);
                }
            }

            public static class PickOrderBean {
                public boolean show;
                public boolean check;

                public static PickOrderBean objectFromData(String str) {

                    return new Gson().fromJson(str, PickOrderBean.class);
                }
            }

            public static class TransOrderBean {
                public boolean show;
                public boolean check;

                public static TransOrderBean objectFromData(String str) {

                    return new Gson().fromJson(str, TransOrderBean.class);
                }
            }

            public static class TagMulitBean {
                public boolean show;
                public boolean check;

                public static TagMulitBean objectFromData(String str) {

                    return new Gson().fromJson(str, TagMulitBean.class);
                }
            }
        }

        public static class DeliveryPosBean {
            public boolean switch_set;
            public String position;

            public static DeliveryPosBean objectFromData(String str) {

                return new Gson().fromJson(str, DeliveryPosBean.class);
            }
        }

        public static class CashOwnBrokerBean {
            public boolean switch_set;
            public String position;

            public static CashOwnBrokerBean objectFromData(String str) {

                return new Gson().fromJson(str, CashOwnBrokerBean.class);
            }
        }

        public static class OptionalPaymentBean {
            public boolean switch_set;
            public List<String> options;

            public static OptionalPaymentBean objectFromData(String str) {

                return new Gson().fromJson(str, OptionalPaymentBean.class);
            }
        }

        public static class OutgoFeeBean {
            public boolean switch_set;
            public List<String> show;
            public List<String> hidden;

            public static OutgoFeeBean objectFromData(String str) {

                return new Gson().fromJson(str, OutgoFeeBean.class);
            }
        }

        public static class StdFeeBean {
            public boolean switch_set;
            public List<String> show;
            public List<String> hidden;

            public static StdFeeBean objectFromData(String str) {

                return new Gson().fromJson(str, StdFeeBean.class);
            }
        }

        public static class TransferFeeBean {
            public boolean switch_set;
            public List<?> show;
            public List<String> hidden;

            public static TransferFeeBean objectFromData(String str) {

                return new Gson().fromJson(str, TransferFeeBean.class);
            }
        }

        public static class OinfoShowBean {
            public String text;

            public static OinfoShowBean objectFromData(String str) {

                return new Gson().fromJson(str, OinfoShowBean.class);
            }
        }

        public static class TabPokeBean {
            public boolean switch_set;
            public List<String> show;
            public List<?> hidden;

            public static TabPokeBean objectFromData(String str) {

                return new Gson().fromJson(str, TabPokeBean.class);
            }
        }

        public static class InfoTabsBean {
            public boolean switch_set;
            public List<String> show;
            public List<?> hidden;

            public static InfoTabsBean objectFromData(String str) {

                return new Gson().fromJson(str, InfoTabsBean.class);
            }
        }

        public static class TransInfoBean {
            public boolean switch_set;
            public boolean checked;

            public static TransInfoBean objectFromData(String str) {

                return new Gson().fromJson(str, TransInfoBean.class);
            }
        }

        public static class CoFeatureBean {
            public String text;

            public static CoFeatureBean objectFromData(String str) {

                return new Gson().fromJson(str, CoFeatureBean.class);
            }
        }

        public static class StartNoedtBean {
            public boolean switch_set;
            public boolean noedit;

            public static StartNoedtBean objectFromData(String str) {

                return new Gson().fromJson(str, StartNoedtBean.class);
            }
        }

        public static class EntrustCheckEnableBean {
            public boolean switch_set;
            public boolean enalbed;

            public static EntrustCheckEnableBean objectFromData(String str) {

                return new Gson().fromJson(str, EntrustCheckEnableBean.class);
            }
        }

        public static class GeneralUnSupportBean {
            public boolean switch_set;
            public boolean un_support;

            public static GeneralUnSupportBean objectFromData(String str) {

                return new Gson().fromJson(str, GeneralUnSupportBean.class);
            }
        }

        public static class SendMustInBean {
            public boolean switch_set;
            public boolean isIn;

            public static SendMustInBean objectFromData(String str) {

                return new Gson().fromJson(str, SendMustInBean.class);
            }
        }

        public static class ReceiveMustInBean {
            public boolean switch_set;
            public boolean isIn;

            public static ReceiveMustInBean objectFromData(String str) {

                return new Gson().fromJson(str, ReceiveMustInBean.class);
            }
        }

        public static class MapChooseEnableBean {
            public boolean switch_set;
            public boolean map_on;

            public static MapChooseEnableBean objectFromData(String str) {

                return new Gson().fromJson(str, MapChooseEnableBean.class);
            }
        }

        public static class PersonPhoneCheckBean {
            public boolean switch_set;
            public boolean phoneCheck;

            public static PersonPhoneCheckBean objectFromData(String str) {

                return new Gson().fromJson(str, PersonPhoneCheckBean.class);
            }
        }

        public static class GoodsSerialEnableBean {
            public boolean switch_set;
            public boolean serial_on;

            public static GoodsSerialEnableBean objectFromData(String str) {

                return new Gson().fromJson(str, GoodsSerialEnableBean.class);
            }
        }

        public static class TransInInfoBean {
            public boolean switch_set;
            public boolean trans_on;

            public static TransInInfoBean objectFromData(String str) {

                return new Gson().fromJson(str, TransInInfoBean.class);
            }
        }

        public static class InDaysBean {
            public boolean switch_set;
            public boolean checked;
            public String value;

            public static InDaysBean objectFromData(String str) {

                return new Gson().fromJson(str, InDaysBean.class);
            }
        }

        public static class WhenOrderRepeatBean {
            public boolean switch_set;
            public String value;

            public static WhenOrderRepeatBean objectFromData(String str) {

                return new Gson().fromJson(str, WhenOrderRepeatBean.class);
            }
        }

        public static class NoticeToReleaseBean {
            public boolean switch_set;
            public List<String> value;

            public static NoticeToReleaseBean objectFromData(String str) {

                return new Gson().fromJson(str, NoticeToReleaseBean.class);
            }
        }

        public static class WeightToVolumeBean {
            public boolean switch_set;
            public String weight;
            public String volume;

            public static WeightToVolumeBean objectFromData(String str) {

                return new Gson().fromJson(str, WeightToVolumeBean.class);
            }
        }

        public static class CoDefValBean {
            public String text;

            public static CoDefValBean objectFromData(String str) {

                return new Gson().fromJson(str, CoDefValBean.class);
            }
        }

        public static class StartBean {
            public boolean switch_set;
            /**
             * adcode :
             * city :
             * district :
             * poi :
             * province :
             * show_val : 888aaa
             */

            public ValueBean value;
//            public String value;

            public static StartBean objectFromData(String str) {

                return new Gson().fromJson(str, StartBean.class);
            }

            public static class ValueBean {
                public String adcode;
                public String city;
                public String district;
                public String poi;
                public String province;
                public String show_val;

                public static ValueBean objectFromData(String str) {

                    return new Gson().fromJson(str, ValueBean.class);
                }
            }
        }

        public static class NumBean {
            public boolean switch_set;
            public String value;

            public static NumBean objectFromData(String str) {

                return new Gson().fromJson(str, NumBean.class);
            }
        }

        public static class DeliveryWayBean {
            public boolean switch_set;
            public String value;

            public static DeliveryWayBean objectFromData(String str) {

                return new Gson().fromJson(str, DeliveryWayBean.class);
            }
        }

        public static class ReceiptTypeBean {
            public boolean switch_set;
            public String value;

            public static ReceiptTypeBean objectFromData(String str) {

                return new Gson().fromJson(str, ReceiptTypeBean.class);
            }
        }

        public static class ReceiptNumBean {
            public boolean switch_set;
            public String value;

            public static ReceiptNumBean objectFromData(String str) {

                return new Gson().fromJson(str, ReceiptNumBean.class);
            }
        }

        public static class ReturnPayNumBean {
            public boolean switch_set;
            public String value;

            public static ReturnPayNumBean objectFromData(String str) {

                return new Gson().fromJson(str, ReturnPayNumBean.class);
            }
        }

        public static class WeightUnitBean {
            public boolean switch_set;
            public String value;

            public static WeightUnitBean objectFromData(String str) {

                return new Gson().fromJson(str, WeightUnitBean.class);
            }
        }

        public static class UnitPriceBean {
            public boolean switch_set;
            public String value;

            public static UnitPriceBean objectFromData(String str) {

                return new Gson().fromJson(str, UnitPriceBean.class);
            }
        }

        public static class PaymentBean {
            public boolean switch_set;
            public String value;

            public static PaymentBean objectFromData(String str) {

                return new Gson().fromJson(str, PaymentBean.class);
            }
        }

        public static class TransportTypeBean {
            public boolean switch_set;
            public String value;

            public static TransportTypeBean objectFromData(String str) {

                return new Gson().fromJson(str, TransportTypeBean.class);
            }
        }

        public static class PrintCopiesBean {
            public boolean switch_set;
            public String value;

            public static PrintCopiesBean objectFromData(String str) {

                return new Gson().fromJson(str, PrintCopiesBean.class);
            }
        }

        public static class DeclareValueBean {
            public boolean switch_set;
            public String value;

            public static DeclareValueBean objectFromData(String str) {

                return new Gson().fromJson(str, DeclareValueBean.class);
            }
        }

        public static class DeclareRemarkBean {
            public boolean switch_set;
            public String money;
            public String text;

            public static DeclareRemarkBean objectFromData(String str) {

                return new Gson().fromJson(str, DeclareRemarkBean.class);
            }
        }

        public static class PaymentUponLastBean {
            public boolean switch_set;
            public boolean checked;

            public static PaymentUponLastBean objectFromData(String str) {

                return new Gson().fromJson(str, PaymentUponLastBean.class);
            }
        }

        public static class MgrUponLastBean {
            public boolean switch_set;
            public boolean checked;

            public static MgrUponLastBean objectFromData(String str) {

                return new Gson().fromJson(str, MgrUponLastBean.class);
            }
        }

        public static class CustomerInfoBean {
            public String text;

            public static CustomerInfoBean objectFromData(String str) {

                return new Gson().fromJson(str, CustomerInfoBean.class);
            }
        }

        public static class CorSugShowBean {
            public boolean switch_set;
            public List<String> cor_sug_show_val;

            public static CorSugShowBean objectFromData(String str) {

                return new Gson().fromJson(str, CorSugShowBean.class);
            }
        }

        public static class CeeSugShowBean {
            public boolean switch_set;
            public List<String> cee_sug_show_val;

            public static CeeSugShowBean objectFromData(String str) {

                return new Gson().fromJson(str, CeeSugShowBean.class);
            }
        }

        public static class GoodsInfoBean {
            public String text;

            public static GoodsInfoBean objectFromData(String str) {

                return new Gson().fromJson(str, GoodsInfoBean.class);
            }
        }

        public static class GoodsNameBean {
            public boolean lock;
            public boolean switch_set;
            /**
             * key : 100
             * name : 把
             */

            public List<SelcValueBean> selc_value;

            public static GoodsNameBean objectFromData(String str) {

                return new Gson().fromJson(str, GoodsNameBean.class);
            }

            public static class SelcValueBean {
                public String key;
                public String name;

                public static SelcValueBean objectFromData(String str) {

                    return new Gson().fromJson(str, SelcValueBean.class);
                }
            }
        }

        public static class PkgNameBean {
            public boolean lock;
            public boolean switch_set;
            /**
             * key : 100
             * name : 图
             */

            public List<SelcValueBean> selc_value;

            public static PkgNameBean objectFromData(String str) {

                return new Gson().fromJson(str, PkgNameBean.class);
            }

            public static class SelcValueBean {
                public String key;
                public String name;

                public static SelcValueBean objectFromData(String str) {

                    return new Gson().fromJson(str, SelcValueBean.class);
                }
            }
        }

        public static class GoodsCatBean {
            public boolean switch_set;
            public boolean lock;
            public List<?> selc_value;

            public static GoodsCatBean objectFromData(String str) {

                return new Gson().fromJson(str, GoodsCatBean.class);
            }
        }

        public static class TransportInfoBean {
            public String text;

            public static TransportInfoBean objectFromData(String str) {

                return new Gson().fromJson(str, TransportInfoBean.class);
            }
        }

        public static class DeliveryNeedBean {
            public boolean switch_set;
            public List<String> value;

            public static DeliveryNeedBean objectFromData(String str) {

                return new Gson().fromJson(str, DeliveryNeedBean.class);
            }
        }

        public static class DoorPickNeedBean {
            public boolean switch_set;
            public List<String> value;

            public static DoorPickNeedBean objectFromData(String str) {

                return new Gson().fromJson(str, DoorPickNeedBean.class);
            }
        }

        public static class TransportAddBean {
            public boolean switch_set;
            /**
             * key : 100
             * name : 头像
             */

            public List<ValueBean> value;

            public static TransportAddBean objectFromData(String str) {

                return new Gson().fromJson(str, TransportAddBean.class);
            }

            public static class ValueBean {
                public String key;
                public String name;

                public static ValueBean objectFromData(String str) {

                    return new Gson().fromJson(str, ValueBean.class);
                }
            }
        }

        public static class TransportRemarkBean {
            public boolean switch_set;
            public boolean lock;
            public List<?> value;

            public static TransportRemarkBean objectFromData(String str) {

                return new Gson().fromJson(str, TransportRemarkBean.class);
            }
        }

        public static class Delivery0DeliveryBean {
            public boolean switch_set;
            public boolean checked;

            public static Delivery0DeliveryBean objectFromData(String str) {

                return new Gson().fromJson(str, Delivery0DeliveryBean.class);
            }
        }

        public static class Delivery0LoadBean {
            public boolean switch_set;
            public boolean checked;

            public static Delivery0LoadBean objectFromData(String str) {

                return new Gson().fromJson(str, Delivery0LoadBean.class);
            }
        }

        public static class Delivery0UpstairsBean {
            public boolean switch_set;
            public boolean checked;

            public static Delivery0UpstairsBean objectFromData(String str) {

                return new Gson().fromJson(str, Delivery0UpstairsBean.class);
            }
        }

        public static class Delivery0InstallBean {
            public boolean switch_set;
            public boolean checked;

            public static Delivery0InstallBean objectFromData(String str) {

                return new Gson().fromJson(str, Delivery0InstallBean.class);
            }
        }

        public static class FeeInfoBean {
            public String text;

            public static FeeInfoBean objectFromData(String str) {

                return new Gson().fromJson(str, FeeInfoBean.class);
            }
        }

        public static class TotalCalcBean {
            public boolean switch_set;
            public List<String> value;

            public static TotalCalcBean objectFromData(String str) {

                return new Gson().fromJson(str, TotalCalcBean.class);
            }
        }

        public static class GetUnitBean {
            public boolean switch_set;
            public List<String> value;

            public static GetUnitBean objectFromData(String str) {

                return new Gson().fromJson(str, GetUnitBean.class);
            }
        }

        public static class DecimalPriceBean {
            public boolean switch_set;
            public String checked;
            public String rate;
            public String calc_rule;
            public String min;

            public static DecimalPriceBean objectFromData(String str) {

                return new Gson().fromJson(str, DecimalPriceBean.class);
            }
        }

        public static class CommissionBean {
            public boolean switch_set;
            public String checked;
            public String rate;
            public String calc_rule;
            public String min;

            public static CommissionBean objectFromData(String str) {

                return new Gson().fromJson(str, CommissionBean.class);
            }
        }

        public static class ModifyOrderBean {
            public String text;

            public static ModifyOrderBean objectFromData(String str) {

                return new Gson().fromJson(str, ModifyOrderBean.class);
            }
        }

        public static class ModifyInTransBean {
            public boolean switch_set;
            public boolean checked;

            public static ModifyInTransBean objectFromData(String str) {

                return new Gson().fromJson(str, ModifyInTransBean.class);
            }
        }

        public static class ArrHideInfoBean {
            public String text;

            public static ArrHideInfoBean objectFromData(String str) {

                return new Gson().fromJson(str, ArrHideInfoBean.class);
            }
        }
    }

    public static class PointCostInfoBean {
        public static PointCostInfoBean objectFromData(String str) {

            return new Gson().fromJson(str, PointCostInfoBean.class);
        }
    }

    public static class StdCostBean {
        public static StdCostBean objectFromData(String str) {

            return new Gson().fromJson(str, StdCostBean.class);
        }
    }

    public static class TransInfoBean {
        public static TransInfoBean objectFromData(String str) {

            return new Gson().fromJson(str, TransInfoBean.class);
        }
    }

    public static class EnumBean {
        public static EnumBean objectFromData(String str) {

            return new Gson().fromJson(str, EnumBean.class);
        }
    }


    public static class FnFormulaBean {
        public List<FormulaDtBean> formulaDt;

        public static FnFormulaBean objectFromData(String str) {

            return new Gson().fromJson(str, FnFormulaBean.class);
        }

        public static class FormulaDtBean {
            /**
             * operator : add
             * itemList : ["total_price"]
             * ratio : 1
             */

            public String operator;
            public String ratio;
            public List<String> itemList;

            public static FormulaDtBean objectFromData(String str) {

                return new Gson().fromJson(str, FormulaDtBean.class);
            }
        }
    }


    public static class CutPaymentSetBean {
        /**
         * default_price_pattern : {"can_switch":false,"switch_set":true,"value":""}
         */

        public DefaultPricePatternBean default_price_pattern;

        public static CutPaymentSetBean objectFromData(String str) {

            return new Gson().fromJson(str, CutPaymentSetBean.class);
        }

        public static class DefaultPricePatternBean {
            /**
             * can_switch : false
             * switch_set : true
             * value :
             */

            public boolean can_switch;
            public boolean switch_set;
            public String value;

            public static DefaultPricePatternBean objectFromData(String str) {

                return new Gson().fromJson(str, DefaultPricePatternBean.class);
            }
        }

        @Override
        public String toString() {
            return "CutPaymentSetBean{" +
                    "default_price_pattern=" + default_price_pattern +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "CoSetting{" +
                "company_id=" + company_id +
                ", company_name='" + company_name + '\'' +
                ", order_data=" + order_data.toString() +
                ", co_setting=" + co_setting.toString() +
                ", point_cost_info=" + point_cost_info +
                ", std_cost=" + std_cost +
                ", trans_info=" + trans_info +
                ", enumX=" + enumX +
                ", src='" + src + '\'' +
                ", ext=" + ext +
                ", finance_setting=" + finance_setting +
                ", cut_payment_set=" + cut_payment_set +
                '}';
    }
}
