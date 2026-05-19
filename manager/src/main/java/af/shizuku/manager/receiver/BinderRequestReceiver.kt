package af.shizuku.manager.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import af.shizuku.manager.shell.ShellBinderRequestHandler

class BinderRequestReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action != "af.shizuku.intent.action.REQUEST_BINDER") return
        ShellBinderRequestHandler.handleRequest(context, intent)
    }
}
