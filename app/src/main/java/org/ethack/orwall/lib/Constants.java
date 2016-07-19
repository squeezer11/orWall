package org.ethack.orwall.lib;

/**
 * Constants used across the code
 */
public class Constants {
    public final static String PREFERENCES = "org.ethack.orwall_preferences";
    public final static String PREF_KEY_FIRST_RUN = "first_run";
    public final static String PREF_KEY_SIP_APP = "sip_app";
    public final static String PREF_KEY_SIP_ENABLED = "sip_enabled";
    public final static String PREF_KEY_SPEC_BROWSER = "browser_app";
    public final static String PREF_KEY_BROWSER_ENABLED = "browser_enabled";
    public final static String PREF_KEY_IS_TETHER_ENABLED = "is_tether_enabled";
    public final static String PREF_KEY_TETHER_INTFS = "tether_interfaces";
    public final static String PREF_TRANS_PORT = "proxy_transport";
    public final static String PREF_DNS_PORT = "proxy_dns";
    public final static String PREF_KEY_ADB_ENABLED = "enable_adb";
    public final static String PREF_KEY_SSH_ENABLED = "enable_ssh";
    public final static String PREF_KEY_ENFOCE_INIT = "enforce_init_script";
    public final static String PREF_KEY_DISABLE_INIT = "deactivate_init_script";
    public final static String PREF_KEY_BROWSER_GRACETIME = "browser_gracetime";
    public final static String CONFIG_IPT_SUPPORTS_COMMENTS = "ipt_comments";
    public final static String PREF_KEY_ORWALL_ENABLED = "orwall_enabled";
    public final static String PREF_KEY_CURRENT_SUBNET = "current_subnet";
    public final static String PREF_KEY_HIDE_PRESS_HINT = "hide_press_hint";



    public final static String SPECIAL_APPS_PREFIX = "orwall.special.";
    public final static String IPTABLES = "/system/bin/iptables";
    public final static String IP6TABLES = "/system/bin/ip6tables";

    public final static String ACTION = "org.ethack.orwall.backgroundProcess.action";
    public final static String ACTION_PORTAL = "org.ethack.orwall.backgroundProcess.action.portal";
    public final static String PARAM_ACTIVATE = "org.ethack.orwall.captive.activate";

    public final static String ACTION_ADD_RULE = "org.ethack.orwall.backgroundProcess.action.addRule";
    public final static String ACTION_RM_RULE = "org.ethack.orwall.backgroundProcess.action.rmRule";
    public final static String PARAM_APPUID = "org.ethack.orwall.backgroundProcess.action.rule.appUid";
    public final static String PARAM_APPNAME = "org.ethack.orwall.backgroundProcess.action.rule.appName";
    public final static String PARAM_LOCALHOST = "org.ethack.orwall.backgroundProcess.action.rule.localHost";
    public final static String PARAM_LOCALNETWORK = "org.ethack.orwall.backgroundProcess.action.rule.localNetwork";
    public final static String PARAM_ONIONTYPE = "org.ethack.orwall.backgroundProcess.action.rule.onionType";

    public final static String ACTION_DISABLE_ORWALL = "org.ethack.orwall.backgroundProcess.action.disable_orwall";
    public final static String ACTION_ENABLE_ORWALL = "org.ethack.orwall.backgroundProcess.action.enable_orwall";

    public final static long ORBOT_TRANSPROXY = 9040;
    public final static long ORBOT_DNS_PROXY = 5400;

    public final static long BROWSER_GRACETIME = 5;

    public final static String E_NO_SUCH_FILE = "E_NO_SUCH_FILE";
    public final static String E_NO_SUCH_ALGO = "E_NO_SUCH_ALGO";

    public final static String DB_ONION_TYPE_NONE = "None";
    public final static String DB_ONION_TYPE_TOR = "Tor";
    public final static String DB_ONION_TYPE_BYPASS = "Bypass";

    public final static String ORBOT_APP_NAME = "org.torproject.android";
}
