package a.a.a;

import android.content.Context;
import android.util.Log;

import com.besome.sketch.beans.BlockBean;
import com.besome.sketch.beans.ComponentBean;
import com.besome.sketch.beans.ProjectFileBean;
import com.besome.sketch.beans.ProjectLibraryBean;
import com.besome.sketch.beans.SrcCodeBean;
import com.google.gson.Gson;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import mod.hey.studios.project.ProjectSettings;
import mod.hilal.saif.blocks.CommandBlock;

public class yq {

    /** Assets directory of current project */
    public String A;
    /** Imported fonts directory of current project */
    public String B;
    /** Path of compiled resources in a ZIP file of current project, like /storage/emulated/0/.sketchware/mysc/605/bin/InternalDemo.apk.res */
    public String C;
    /** DEX file called project.dex (??), like /storage/emulated/0/.sketchware/mysc/605/bin/project.dex */
    public String D;
    /** DEX file called classes.dex (??), like /storage/emulated/0/.sketchware/mysc/605/bin/classes.dex */
    public String E;
    /** DEX file called classes2.dex (??), like /storage/emulated/0/.sketchware/mysc/605/bin/classes2.dex */
    public String F;
    /** Unsigned APK file's path, like /storage/emulated/0/.sketchware/mysc/605/bin/InternalDemo.apk.unsigned */
    public String G;
    /** Signed APK file's path, like /storage/emulated/0/.sketchware/mysc/605/bin/InternalDemo.apk */
    public String H;
    /** Release APK file's path, like /storage/emulated/0/sketchware/signed_apk/InternalDemo_release.apk */
    public String I;
    /** Unused */
    public String J;
    /** Unknown, like [SketchApplication.java, DebugActivity.java] */
    public ArrayList<String> K;
    public oB L;
    public Gson M;
    public jq N;
    public Zo O;

    /** HashMap containing information about current project stored in /Internal storage/.sketchware/data/sc_id/project, like {custom_icon=false, sc_ver_code=1, my_ws_name=InternalDemo, color_accent=-1.6740915E7, my_app_name=Sketchware Pro Remod Remod Demo, sc_ver_name=1.0, sc_id=605, color_primary=-1.6740915E7, color_control_highlight=5.36907213E8, color_control_normal=-1.1026706E7, my_sc_reg_dt=20210130213630, sketchware_ver=150.0, my_sc_pkg_name=com.jbk.internal.demo, color_primary_dark=-1.674323E7} */
    public HashMap<String, Object> a;
    /** ProGuard rules file's path, like /storage/emulated/0/.sketchware/mysc/605/bin/aapt_rules.pro */
    public String aapt_rules;
    /** Project's sc_id, like 605 */
    public String b;
    /** Project's mysc folder path, like /storage/emulated/0/.sketchware/mysc/605/ */
    public String c;
    /** ProGuarded classes.jar file's path of current project, like /storage/emulated/0/.sketchware/mysc/605/bin/classes_proguard.jar */
    public String classes_proguard;
    /** Project name of current project, like InternalDemo */
    public String d;
    /** Package name of current project, like com.jbk.internal.demo */
    public String e;
    /** Application's name of current project, like Sketchware Pro Remod Remod Demo */
    public String f;
    /** Unknown, like -16740915 */
    public int g;
    /** Unknown, like -16740915 */
    public int h;
    /** Unknown, like -16743230 */
    public int i;
    /** Unknown, like 36907213 */
    public int j;
    /** Unknown, like -11026706 */
    public int k;
    /** Version code of current project, like 1*/
    public String l;
    /** Version name of current project, like 1.0 */
    public String m;
    /** Package name of current project, but "folders" separated with slashes (/) instead of periods (.), like com/jbk/internal/demo */
    public String n;
    /** Project's compiled MainActivity.java file's path, like /storage/emulated/0/.sketchware/mysc/605/app/src/main/java/com/jbk/internal/demo/MainActivity.java */
    public String o;
    /** Project's MainActivity's full Java name, like com.jbk.internal.demo.MainActivity */
    public String p;
    /** Unknown, but surely ProGuard related, like /storage/emulated/0/.sketchware/mysc/605/bin/mapping.txt */
    public String printmapping;
    /** Unknown, but surely ProGuard related, like /storage/emulated/0/.sketchware/mysc/605/bin/seeds.txt */
    public String printseeds;
    /** Unknown, but surely ProGuard related, like /storage/emulated/0/.sketchware/mysc/605/bin/usage.txt */
    public String printusage;
    /** Current project's ProjectSettings object */
    public ProjectSettings projectSettings;
    /** Project's compiled SketchApplication.java's path, like /storage/emulated/0/.sketchware/mysc/605/app/src/main/java/com/jbk/internal/demo/SketchApplication.java */
    public String q;
    /** Compiled AndroidManifest.xml's path of current project */
    public String r;
    /** Unknown, surely ProGuard related, like /storage/emulated/0/.sketchware/mysc/605/bin/rules_generated.pro */
    public String rules_generated;
    /** Project's generated Java files directory, like /storage/emulated/0/.sketchware/mysc/605/app/src/main */
    public String s;
    /** Project's compiled binary directory, like /storage/emulated/0/.sketchware/mysc/605/bin */
    public String t;
    /** Project's compiled Java classes directory, like /storage/emulated/0/.sketchware/mysc/605/bin/classes */
    public String u;
    /** Project's generated R.java files directory, like /storage/emulated/0/.sketchware/mysc/605/gen */
    public String v;
    /** Generated project resources directory, like /storage/emulated/0/.sketchware/mysc/605/app/src/main/res */
    public String w;
    /** Project's generated layout files directory, like /storage/emulated/0/.sketchware/mysc/605/app/src/main/res/layout */
    public String x;
    /** Project's generated Java files directory, like /storage/emulated/0/.sketchware/mysc/605/app/src/main/java */
    public String y;
    /** Project's imported sounds directory, like /storage/emulated/0/.sketchware/mysc/605/app/src/main/res/raw*/
    public String z;

    public yq(Context context, String str) {
        this(context, wq.d(str), lC.b(str));
    }

    public yq(Context context, String str, HashMap<String, Object> hashMap) {
        N = new jq();
        a = hashMap;
        b = yB.c(hashMap, "sc_id");
        c = str;
        e = yB.c(hashMap, "my_sc_pkg_name");
        d = yB.c(hashMap, "my_ws_name");
        f = yB.c(hashMap, "my_app_name");
        l = yB.c(hashMap, "sc_ver_code");
        m = yB.c(hashMap, "sc_ver_name");
        g = yB.a(hashMap, "color_accent", context.getResources().getColor(2131034159));
        h = yB.a(hashMap, "color_primary", context.getResources().getColor(2131034174));
        i = yB.a(hashMap, "color_primary_dark", context.getResources().getColor(2131034176));
        j = yB.a(hashMap, "color_control_highlight", context.getResources().getColor(2131034172));
        k = yB.a(hashMap, "color_control_normal", context.getResources().getColor(2131034173));
        projectSettings = new ProjectSettings(b);
        b(context);
    }

    public void a() {
        File file = new File(w + File.separator + "values-v21");
        if (file.exists()) {
            L.a(file);
        }
    }

    public void b() {
    }

    public final void b(Context context) {
        L = new oB(true);
        M = new Gson();
        O = new Zo(context);
        K = new ArrayList<>();
        K.add("SketchApplication.java");
        K.add("DebugActivity.java");
        if (!c.endsWith(File.separator)) {
            c += File.separator;
        }
        n = e.replaceAll("\\.", File.separator);
        t = c + "bin";
        u = t + File.separator + "classes";
        classes_proguard = t + File.separator + "classes_proguard.jar";
        aapt_rules = t + File.separator + "aapt_rules.pro";
        printseeds = t + File.separator + "seeds.txt";
        printusage = t + File.separator + "usage.txt";
        printmapping = t + File.separator + "mapping.txt";
        rules_generated = t + File.separator + "rules_generated.pro";
        v = c + "gen";
        s = c + "app" + File.separator + "src" + File.separator + "main";
        y = s + File.separator + "java";
        w = s + File.separator + "res";
        x = w + File.separator + "layout";
        z = w + File.separator + "raw";
        A = s + File.separator + "assets";
        B = A + File.separator + "fonts";
        r = c + "app" + File.separator + "src" + File.separator + "main" + File.separator + "AndroidManifest.xml";
        C = t + File.separator + d + ".apk.res";
        D = t + File.separator + "project.dex";
        E = t + File.separator + "classes.dex";
        F = t + File.separator + "classes2.dex";
        o = y + File.separator + n;
        o += File.separator + "MainActivity.java";
        p = e + "." + "MainActivity.java".replaceAll(".java", "");
        q = y + File.separator + n;
        q += File.separator + "SketchApplication.java";
        G = t + File.separator + d + ".apk.unsigned";
        H = t + File.separator + d + ".apk";
        I = wq.o() + File.separator + d + "_release.apk";
    }

    public void c() {
    }

    public void c(Context context) {
        L.f(t);
        L.f(u);
        L.f(v);
        L.f(y);
        L.f(w);
        L.f(x);
        L.f(z);
        L.f(A);
        L.f(B);
        a(context);
    }

    public void d() {
        if (g()) {
            new File(I).delete();
        }
    }

    public void e() {
        L.f(t);
        L.f(u);
        L.f(v);
    }

    public void f() {
        L.b(t);
        L.b(v);
    }

    public boolean g() {
        return new File(I).exists();
    }

    public void h() {
        String a2 = Lx.a(28, 21, 28, N);
        oB oBVar = L;
        oBVar.b(c + File.separator + "app" + File.separator + "build.gradle", a2);
        String a3 = Lx.a();
        oB oBVar2 = L;
        oBVar2.b(c + File.separator + "settings.gradle", a3);
        String c2 = Lx.c("3.4.2", "4.3.3");
        oB oBVar3 = L;
        oBVar3.b(c + File.separator + "build.gradle", c2);
    }

    public void a(Context context, String str) {
        try {
            KB.a(context, str, w);
        } catch (Exception e2) {
            Log.e("ERROR", e2.getMessage(), e2);
        }
    }

    public void a(String str) {
        try {
            L.a(str, w + File.separator + "drawable-xhdpi" + File.separator + "app_icon.png");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(Context context) {
        oB oBVar = L;
        String replaceAll = oBVar.b(context, "debug" + File.separator + "DebugActivity.java").replaceAll("<\\?package_name\\?>", e);
        oB oBVar2 = L;
        oBVar2.b(y + File.separator + n + File.separator + "DebugActivity.java", replaceAll);
        oB oBVar3 = L;
        String sb = "debug" +
                File.separator +
                "SketchApplication.java";
        String replaceAll2 = oBVar3.b(context, sb).replaceAll("<\\?package_name\\?>", e);
        oB oBVar4 = L;
        oBVar4.b(y + File.separator + n + File.separator + "SketchApplication.java", replaceAll2);
    }

    public void a(String str, String str2) {
        if (str.endsWith("java")) {
            oB oBVar = L;
            oBVar.b(y + File.separator + n + File.separator + str, str2);
        } else if (str.equals("AndroidManifest.xml")) {
            L.b(r, str2);
        } else if (str.equals("colors.xml") || str.equals("styles.xml") || str.equals("strings.xml")) {
            oB oBVar2 = L;
            oBVar2.b(w + File.separator + "values" + File.separator + str, str2);
        } else if (str.equals("provider_paths.xml")) {
            oB oBVar3 = L;
            oBVar3.b(w + File.separator + "xml" + File.separator + str, str2);
        } else {
            oB oBVar4 = L;
            oBVar4.b(x + File.separator + str, str2);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(iC iCVar, hC hCVar, eC eCVar, boolean z2) {
        char c2;
        N = new jq();
        jq jqVar = N;
        jqVar.a = e;
        jqVar.b = f;
        jqVar.c = l;
        jqVar.d = m;
        jqVar.sc_id = b;
        jqVar.e = O.h();
        N.f = !z2;
        if (iCVar.d().useYn.equals("Y")) {
            jq jqVar2 = N;
            jqVar2.h = true;
            jqVar2.a(2);
            N.a(8);
        }
        if (iCVar.c().useYn.equals("Y")) {
            N.g = true;
        }
        if (iCVar.b().useYn.equals("Y")) {
            jq jqVar3 = N;
            jqVar3.l = true;
            jqVar3.a(2);
            N.a(8);
            N.a(iCVar.b());
        }
        if (iCVar.e().useYn.equals("Y")) {
            jq jqVar4 = N;
            jqVar4.m = true;
            jqVar4.a(2);
            N.a(8);
            N.b(iCVar.e());
        }
        for (ProjectFileBean next : hCVar.b()) {
            if (next.hasActivityOption(4)) {
                N.a(next.getActivityName()).a = true;
            }
            for (ComponentBean next2 : eCVar.e(next.getJavaName())) {
                if (next2.type == 15 || next2.type == 35) {
                    jq jqVar5 = N;
                    jqVar5.g = true;
                    jqVar5.u = true;
                    jqVar5.a(next.getActivityName(), 16);
                    N.a(next.getActivityName(), 32);
                    N.a(next.getActivityName(), 64);
                }
                N.x.handleComponent(next2.type);
                if (next2.type == 16) {
                    N.a(next.getActivityName(), 32);
                }
                if (next2.type == 6) {
                    jq jqVar6 = N;
                    jqVar6.o = true;
                    jqVar6.j = true;
                    jqVar6.a(next.getActivityName(), 2);
                    N.a(next.getActivityName(), 8);
                }
                if (next2.type == 14) {
                    jq jqVar7 = N;
                    jqVar7.k = true;
                    jqVar7.a(next.getActivityName(), 32);
                    N.a(next.getActivityName(), 64);
                }
                if (next2.type == 4) {
                    N.a(next.getActivityName(), 4);
                }
                if (next2.type == 12) {
                    jq jqVar8 = N;
                    jqVar8.i = true;
                    jqVar8.a(next.getActivityName()).b = true;
                }
                if (next2.type == 17) {
                    jq jqVar9 = N;
                    jqVar9.o = true;
                    jqVar9.p = true;
                    jqVar9.a(next.getActivityName(), 2);
                    N.a(next.getActivityName(), 8);
                }
                if (next2.type == 19) {
                    N.a(next.getActivityName(), 128);
                }
                if (next2.type == 20) {
                    N.a(next.getActivityName(), 256);
                    N.a(next.getActivityName(), 512);
                }
                if (next2.type == 21) {
                    Log.d("location", "permission location : activity");
                    N.a(next.getActivityName(), 1024);
                }
            }
            for (Map.Entry<String, ArrayList<BlockBean>> entry : eCVar.b(next.getJavaName()).entrySet()) {
                for (BlockBean next3 : entry.getValue()) {
                    N.x.setParams(next3.parameters, e, next3.opCode);
                    String str = next3.opCode;
                    switch (str.hashCode()) {
                        case -2135695280:
                            if (str.equals("webViewLoadUrl")) {
                                c2 = '!';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -2055793167:
                            if (str.equals("fileutillistdir")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1834369666:
                            if (str.equals("setBitmapFileBrightness")) {
                                c2 = 26;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1483954587:
                            if (str.equals("fileutilisdir")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1471049951:
                            if (str.equals("fileutilwrite")) {
                                c2 = '\f';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1405157727:
                            if (str.equals("fileutilmakedir")) {
                                c2 = 16;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1063598745:
                            if (str.equals("resizeBitmapFileRetainRatio")) {
                                c2 = 17;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -917343271:
                            if (str.equals("getJpegRotate")) {
                                c2 = '\t';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -903177036:
                            if (str.equals("resizeBitmapFileWithRoundedBorder")) {
                                c2 = 20;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -733318734:
                            if (str.equals("strToListMap")) {
                                c2 = 30;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -602241037:
                            if (str.equals("fileutilcopy")) {
                                c2 = '\r';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -601942961:
                            if (str.equals("fileutilmove")) {
                                c2 = 14;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -601804268:
                            if (str.equals("fileutilread")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -149850417:
                            if (str.equals("fileutilisexist")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 16308074:
                            if (str.equals("resizeBitmapFileToCircle")) {
                                c2 = 19;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 56167279:
                            if (str.equals("setBitmapFileContrast")) {
                                c2 = 27;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 163812602:
                            if (str.equals("cropBitmapFileFromCenter")) {
                                c2 = 21;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 168740282:
                            if (str.equals("mapToStr")) {
                                c2 = 29;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 470160234:
                            if (str.equals("fileutilGetLastSegmentPath")) {
                                c2 = 11;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 481850295:
                            if (str.equals("resizeBitmapFileToSquare")) {
                                c2 = 18;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 571046965:
                            if (str.equals("scaleBitmapFile")) {
                                c2 = 23;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 725249532:
                            if (str.equals("intentSetAction")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 950609198:
                            if (str.equals("setBitmapFileColorFilter")) {
                                c2 = 25;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1086207657:
                            if (str.equals("fileutildelete")) {
                                c2 = 15;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1129709718:
                            if (str.equals("setImageUrl")) {
                                c2 = ' ';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1156598140:
                            if (str.equals("fileutilEndsWith")) {
                                c2 = '\b';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1242107556:
                            if (str.equals("fileutilisfile")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1252547704:
                            if (str.equals("listMapToStr")) {
                                c2 = 31;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1315302372:
                            if (str.equals("fileutillength")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1695890133:
                            if (str.equals("fileutilStartsWith")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1775620400:
                            if (str.equals("strToMap")) {
                                c2 = 28;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1792552710:
                            if (str.equals("rotateBitmapFile")) {
                                c2 = 22;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1974249461:
                            if (str.equals("skewBitmapFile")) {
                                c2 = 24;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1976325370:
                            if (str.equals("setImageFilePath")) {
                                c2 = '\n';
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            if (next3.parameters.get(1).equals(uq.c[1])) {
                                N.a(next.getActivityName(), 1);
                            }
                            break;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                        case '\t':
                        case '\n':
                        case 11:
                            N.a(next.getActivityName(), 32);
                            break;
                        case '\f':
                        case '\r':
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                            N.a(next.getActivityName(), 32);
                            N.a(next.getActivityName(), 64);
                            break;
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            N.o = true;
                            break;
                        case ' ':
                            jq jqVar10 = N;
                            jqVar10.n = true;
                            jqVar10.a(2);
                            N.a(8);
                            break;
                        case '!':
                            N.a(2);
                            N.a(8);
                            break;
                    }
                }
            }
            N.b();
        }
    }

    public void b(hC hCVar, eC eCVar, iC iCVar) {
        b(hCVar, eCVar, iCVar, false);
    }

    public void b(hC hCVar, eC eCVar, iC iCVar, boolean z2) {
        boolean z3;
        ArrayList<SrcCodeBean> a2 = a(hCVar, eCVar, iCVar, z2);
        if (N.u) {
            Nx nx = new Nx("paths");
            nx.a("xmlns", "android", "http://schemas.android.com/apk/res/android");
            Nx nx2 = new Nx("external-path");
            nx2.a("", "name", "external_files");
            nx2.a("", "path", ".");
            nx.a(nx2);
            a2.add(new SrcCodeBean("provider_paths.xml", nx.b()));
        }
        a2.add(new SrcCodeBean("SketchwareUtil.java", Lx.i(e)));
        a2.add(new SrcCodeBean("FileUtil.java", Lx.e(e)));
        a2.add(new SrcCodeBean("RequestNetwork.java", Lx.h(e)));
        a2.add(new SrcCodeBean("RequestNetworkController.java", Lx.g(e)));
        a2.add(new SrcCodeBean("BluetoothConnect.java", Lx.b(e)));
        a2.add(new SrcCodeBean("BluetoothController.java", Lx.c(e)));
        if (N.m) {
            a2.add(new SrcCodeBean("GoogleMapController.java", Lx.f(e)));
        }
        for (SrcCodeBean next : a2) {
            a(next.srcFileName, next.source);
        }
        jq jqVar = N;
        if (jqVar.h || jqVar.l || jqVar.m) {
            ProjectLibraryBean d2 = iCVar.d();
            Mx mx = new Mx();
            mx.a("google_play_services_version", 12451000);
            if (N.h) {
                z3 = false;
                mx.a("firebase_database_url", "https://" + d2.data + ".firebaseio.com", false);
                mx.a("project_id", d2.data, false);
                mx.a("google_app_id", d2.reserved1, false);
                String str = d2.reserved2;
                if (str != null && str.length() > 0) {
                    mx.a("google_api_key", d2.reserved2, false);
                }
                String str2 = d2.reserved3;
                if (str2 != null && str2.length() > 0) {
                    mx.a("google_storage_bucket", d2.reserved3, false);
                }
            } else {
                z3 = false;
            }
            if (N.m) {
                mx.a("google_maps_key", iCVar.e().data, z3);
            }
            oB oBVar = L;
            oBVar.b(w + File.separator + "values" + File.separator + "secrets.xml", mx.a());
        }
        h();
    }

    /** Get source code files that are viewable in SrcCodeViewer (?) */
    public ArrayList<SrcCodeBean> a(hC hCVar, eC eCVar, iC iCVar, boolean z2) {
        a(iCVar, hCVar, eCVar, z2);
        CommandBlock.x();
        ArrayList<SrcCodeBean> arrayList = new ArrayList<>();
        for (ProjectFileBean next : hCVar.b()) {
            arrayList.add(new SrcCodeBean(next.getJavaName(), new Jx(N, next, eCVar).a()));
        }
        for (ProjectFileBean next2 : hCVar.b()) {
            String xmlName = next2.getXmlName();
            Ox ox = new Ox(N, next2);
            ox.a(eC.a(eCVar.d(xmlName)), eCVar.h(xmlName));
            arrayList.add(new SrcCodeBean(xmlName, CommandBlock.applyCommands(xmlName, ox.b())));
        }
        for (ProjectFileBean next3 : hCVar.c()) {
            String xmlName2 = next3.getXmlName();
            Ox ox2 = new Ox(N, next3);
            ox2.a(eC.a(eCVar.d(xmlName2)));
            arrayList.add(new SrcCodeBean(xmlName2, CommandBlock.applyCommands(xmlName2, ox2.b())));
        }
        Ix ix = new Ix(N, hCVar.b());
        ix.setYq(this);
        arrayList.add(new SrcCodeBean("AndroidManifest.xml", CommandBlock.applyCommands("AndroidManifest.xml", ix.a())));
        if (N.g) {
            boolean useNewMaterialComponentsTheme = projectSettings.getValue("enable_bridgeless_themes", "false").equals("true");
            Mx colorsFileBuilder = new Mx();
            colorsFileBuilder.a("colorPrimary", String.format("#%06X", h & 16777215));
            colorsFileBuilder.a("colorPrimaryDark", String.format("#%06X", i & 16777215));
            colorsFileBuilder.a("colorAccent", String.format("#%06X", g & 16777215));
            colorsFileBuilder.a("colorControlHighlight", String.format("#%06X", j & 16777215));
            colorsFileBuilder.a("colorControlNormal", String.format("#%06X", k & 16777215));
            arrayList.add(new SrcCodeBean("colors.xml", CommandBlock.applyCommands("colors.xml", colorsFileBuilder.a())));
            Mx stylesFileBuilder = new Mx();
            stylesFileBuilder.c("AppTheme", "Theme.MaterialComponents.Light.NoActionBar" + (!useNewMaterialComponentsTheme ? ".Bridge" : ""));
            stylesFileBuilder.a("AppTheme", "colorPrimary", "@color/colorPrimary");
            stylesFileBuilder.a("AppTheme", "colorPrimaryDark", "@color/colorPrimaryDark");
            stylesFileBuilder.a("AppTheme", "colorAccent", "@color/colorAccent");
            stylesFileBuilder.a("AppTheme", "colorControlHighlight", "@color/colorControlHighlight");
            stylesFileBuilder.a("AppTheme", "colorControlNormal", "@color/colorControlNormal");
            stylesFileBuilder.c("AppTheme.FullScreen", "AppTheme");
            stylesFileBuilder.a("AppTheme.FullScreen", "android:windowFullscreen", "true");
            stylesFileBuilder.a("AppTheme.FullScreen", "android:windowContentOverlay", "@null");
            stylesFileBuilder.c("AppTheme.AppBarOverlay", "ThemeOverlay.MaterialComponents.Dark.ActionBar");
            stylesFileBuilder.c("AppTheme.PopupOverlay", "ThemeOverlay.MaterialComponents.Light");
            arrayList.add(new SrcCodeBean("styles.xml", CommandBlock.applyCommands("styles.xml", stylesFileBuilder.a())));
        } else {
            Mx stylesFileBuilder = new Mx();
            stylesFileBuilder.c("AppTheme", "@android:style/Theme.Material.Light.DarkActionBar");
            stylesFileBuilder.a("AppTheme", "android:colorPrimary", "@color/colorPrimary");
            stylesFileBuilder.a("AppTheme", "android:colorPrimaryDark", "@color/colorPrimaryDark");
            stylesFileBuilder.a("AppTheme", "android:colorAccent", "@color/colorAccent");
            stylesFileBuilder.a("AppTheme", "android:colorControlHighlight", "@color/colorControlHighlight");
            stylesFileBuilder.a("AppTheme", "android:colorControlNormal", "@color/colorControlNormal");
            stylesFileBuilder.c("FullScreen", "@android:style/Theme.Material.Light.NoActionBar.Fullscreen");
            stylesFileBuilder.a("FullScreen", "android:colorPrimary", "@color/colorPrimary");
            stylesFileBuilder.a("FullScreen", "android:colorPrimaryDark", "@color/colorPrimaryDark");
            stylesFileBuilder.a("FullScreen", "android:colorAccent", "@color/colorAccent");
            stylesFileBuilder.a("FullScreen", "android:colorControlHighlight", "@color/colorControlHighlight");
            stylesFileBuilder.a("FullScreen", "android:colorControlNormal", "@color/colorControlNormal");
            stylesFileBuilder.c("NoActionBar", "@android:style/Theme.Material.Light.NoActionBar");
            stylesFileBuilder.a("NoActionBar", "android:colorPrimary", "@color/colorPrimary");
            stylesFileBuilder.a("NoActionBar", "android:colorPrimaryDark", "@color/colorPrimaryDark");
            stylesFileBuilder.a("NoActionBar", "android:colorAccent", "@color/colorAccent");
            stylesFileBuilder.a("NoActionBar", "android:colorControlHighlight", "@color/colorControlHighlight");
            stylesFileBuilder.a("NoActionBar", "android:colorControlNormal", "@color/colorControlNormal");
            stylesFileBuilder.c("NoStatusBar", "AppTheme");
            stylesFileBuilder.a("NoStatusBar", "android:windowFullscreen", "true");
            arrayList.add(new SrcCodeBean("styles.xml", CommandBlock.applyCommands("styles.xml", stylesFileBuilder.a())));
            Mx colorsFileBuilder = new Mx();
            colorsFileBuilder.a("colorPrimary", String.format("#%06X", h & 16777215));
            colorsFileBuilder.a("colorPrimaryDark", String.format("#%06X", i & 16777215));
            colorsFileBuilder.a("colorAccent", String.format("#%06X", g & 16777215));
            colorsFileBuilder.a("colorControlHighlight", String.format("#%06X", j & 16777215));
            colorsFileBuilder.a("colorControlNormal", String.format("#%06X", k & 16777215));
            arrayList.add(new SrcCodeBean("colors.xml", CommandBlock.applyCommands("colors.xml", colorsFileBuilder.a())));
        }
        Mx stringsFileBuilder = new Mx();
        stringsFileBuilder.b("app_name", f);
        arrayList.add(new SrcCodeBean("strings.xml", CommandBlock.applyCommands("strings.xml", stringsFileBuilder.a())));
        CommandBlock.x();
        return arrayList;
    }

    public ArrayList<SrcCodeBean> a(hC hCVar, eC eCVar, iC iCVar) {
        return a(hCVar, eCVar, iCVar, false);
    }
}