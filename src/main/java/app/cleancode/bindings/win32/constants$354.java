// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$354 {

    static final FunctionDescriptor CALINFO_ENUMPROCEXA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CALINFO_ENUMPROCEXA$MH = RuntimeHelper.downcallHandle(
        constants$354.CALINFO_ENUMPROCEXA$FUNC
    );
    static final FunctionDescriptor LANGUAGEGROUP_ENUMPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LANGUAGEGROUP_ENUMPROCW$MH = RuntimeHelper.downcallHandle(
        constants$354.LANGUAGEGROUP_ENUMPROCW$FUNC
    );
    static final FunctionDescriptor LANGGROUPLOCALE_ENUMPROCW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LANGGROUPLOCALE_ENUMPROCW$MH = RuntimeHelper.downcallHandle(
        constants$354.LANGGROUPLOCALE_ENUMPROCW$FUNC
    );
}

