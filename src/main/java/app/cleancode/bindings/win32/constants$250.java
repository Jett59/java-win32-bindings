// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$250 {

    static final FunctionDescriptor RegisterClassExW$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterClassExW$MH = RuntimeHelper.downcallHandle(
        "RegisterClassExW",
        constants$250.RegisterClassExW$FUNC
    );
    static final FunctionDescriptor GetClassInfoExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClassInfoExA$MH = RuntimeHelper.downcallHandle(
        "GetClassInfoExA",
        constants$250.GetClassInfoExA$FUNC
    );
    static final FunctionDescriptor GetClassInfoExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClassInfoExW$MH = RuntimeHelper.downcallHandle(
        "GetClassInfoExW",
        constants$250.GetClassInfoExW$FUNC
    );
    static final FunctionDescriptor PREGISTERCLASSNAMEW$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PREGISTERCLASSNAMEW$MH = RuntimeHelper.downcallHandle(
        constants$250.PREGISTERCLASSNAMEW$FUNC
    );
    static final FunctionDescriptor CreateWindowExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateWindowExA$MH = RuntimeHelper.downcallHandle(
        "CreateWindowExA",
        constants$250.CreateWindowExA$FUNC
    );
}


