// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$492 {

    static final FunctionDescriptor RegCreateKeyTransactedA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegCreateKeyTransactedA$MH = RuntimeHelper.downcallHandle(
        "RegCreateKeyTransactedA",
        constants$492.RegCreateKeyTransactedA$FUNC
    );
    static final FunctionDescriptor RegCreateKeyTransactedW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegCreateKeyTransactedW$MH = RuntimeHelper.downcallHandle(
        "RegCreateKeyTransactedW",
        constants$492.RegCreateKeyTransactedW$FUNC
    );
    static final FunctionDescriptor RegDeleteKeyA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegDeleteKeyA$MH = RuntimeHelper.downcallHandle(
        "RegDeleteKeyA",
        constants$492.RegDeleteKeyA$FUNC
    );
    static final FunctionDescriptor RegDeleteKeyW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegDeleteKeyW$MH = RuntimeHelper.downcallHandle(
        "RegDeleteKeyW",
        constants$492.RegDeleteKeyW$FUNC
    );
    static final FunctionDescriptor RegDeleteKeyExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegDeleteKeyExA$MH = RuntimeHelper.downcallHandle(
        "RegDeleteKeyExA",
        constants$492.RegDeleteKeyExA$FUNC
    );
    static final FunctionDescriptor RegDeleteKeyExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegDeleteKeyExW$MH = RuntimeHelper.downcallHandle(
        "RegDeleteKeyExW",
        constants$492.RegDeleteKeyExW$FUNC
    );
}


