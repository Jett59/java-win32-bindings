// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$390 {

    static final FunctionDescriptor RegRestoreKeyA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegRestoreKeyA$MH = RuntimeHelper.downcallHandle(
        "RegRestoreKeyA",
        constants$390.RegRestoreKeyA$FUNC
    );
    static final FunctionDescriptor RegRestoreKeyW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegRestoreKeyW$MH = RuntimeHelper.downcallHandle(
        "RegRestoreKeyW",
        constants$390.RegRestoreKeyW$FUNC
    );
    static final FunctionDescriptor RegRenameKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegRenameKey$MH = RuntimeHelper.downcallHandle(
        "RegRenameKey",
        constants$390.RegRenameKey$FUNC
    );
    static final FunctionDescriptor RegSaveKeyA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegSaveKeyA$MH = RuntimeHelper.downcallHandle(
        "RegSaveKeyA",
        constants$390.RegSaveKeyA$FUNC
    );
    static final FunctionDescriptor RegSaveKeyW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegSaveKeyW$MH = RuntimeHelper.downcallHandle(
        "RegSaveKeyW",
        constants$390.RegSaveKeyW$FUNC
    );
    static final FunctionDescriptor RegSetKeySecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegSetKeySecurity$MH = RuntimeHelper.downcallHandle(
        "RegSetKeySecurity",
        constants$390.RegSetKeySecurity$FUNC
    );
}


