// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$495 {

    static final FunctionDescriptor RegEnumValueW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegEnumValueW$MH = RuntimeHelper.downcallHandle(
        "RegEnumValueW",
        constants$495.RegEnumValueW$FUNC
    );
    static final FunctionDescriptor RegFlushKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegFlushKey$MH = RuntimeHelper.downcallHandle(
        "RegFlushKey",
        constants$495.RegFlushKey$FUNC
    );
    static final FunctionDescriptor RegGetKeySecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegGetKeySecurity$MH = RuntimeHelper.downcallHandle(
        "RegGetKeySecurity",
        constants$495.RegGetKeySecurity$FUNC
    );
    static final FunctionDescriptor RegLoadKeyA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegLoadKeyA$MH = RuntimeHelper.downcallHandle(
        "RegLoadKeyA",
        constants$495.RegLoadKeyA$FUNC
    );
    static final FunctionDescriptor RegLoadKeyW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegLoadKeyW$MH = RuntimeHelper.downcallHandle(
        "RegLoadKeyW",
        constants$495.RegLoadKeyW$FUNC
    );
    static final FunctionDescriptor RegNotifyChangeKeyValue$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegNotifyChangeKeyValue$MH = RuntimeHelper.downcallHandle(
        "RegNotifyChangeKeyValue",
        constants$495.RegNotifyChangeKeyValue$FUNC
    );
}


