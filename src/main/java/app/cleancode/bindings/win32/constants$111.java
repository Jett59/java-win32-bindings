// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$111 {

    static final FunctionDescriptor InitializeSListHead$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitializeSListHead$MH = RuntimeHelper.downcallHandle(
        "InitializeSListHead",
        constants$111.InitializeSListHead$FUNC
    );
    static final FunctionDescriptor InterlockedPopEntrySList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InterlockedPopEntrySList$MH = RuntimeHelper.downcallHandle(
        "InterlockedPopEntrySList",
        constants$111.InterlockedPopEntrySList$FUNC
    );
    static final FunctionDescriptor InterlockedPushEntrySList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InterlockedPushEntrySList$MH = RuntimeHelper.downcallHandle(
        "InterlockedPushEntrySList",
        constants$111.InterlockedPushEntrySList$FUNC
    );
    static final FunctionDescriptor InterlockedPushListSListEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InterlockedPushListSListEx$MH = RuntimeHelper.downcallHandle(
        "InterlockedPushListSListEx",
        constants$111.InterlockedPushListSListEx$FUNC
    );
    static final FunctionDescriptor InterlockedFlushSList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InterlockedFlushSList$MH = RuntimeHelper.downcallHandle(
        "InterlockedFlushSList",
        constants$111.InterlockedFlushSList$FUNC
    );
    static final FunctionDescriptor QueryDepthSList$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryDepthSList$MH = RuntimeHelper.downcallHandle(
        "QueryDepthSList",
        constants$111.QueryDepthSList$FUNC
    );
}


