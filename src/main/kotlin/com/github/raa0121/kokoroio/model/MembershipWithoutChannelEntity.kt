/**
* kokoro.io API document
* X-Access-Token ヘッダーにあなたのアカウントのAPIトークンを含めることでAPIへのアクセスを行うことが出来ます。APIトークンはウェブ管理画面の右上メニュー「アカウント情報 > API情報」から確認可能です。  ただし、 POST /api/v1/devices/ APIへのリクエスト時のみ、APIトークンではなくあなたのアカウント情報を用いて認証を行うことが出来ます。この場合、X-Access-TokenではなくX-Account-Token ヘッダーを使用し、その値にはアカウントのメールアドレスとパスワードをコロンで連結した文字列 \"[email]:[password]\" を Base64 エンコードしたものを指定してください。  また、このページ右上の「Your API token here」の欄にAPIトークンを入力し「Explore」ボタンをクリックすることで、このページの各API説明部分にある「Try it out!」ボタンから実際にAPIを呼び出すことが可能になります。この時、通常のAPI呼び出しと同様、アカウントへの操作が実際に行われますのでご注意ください。 
*
* OpenAPI spec version: 1.0.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package com.github.raa0121.kokoroio.model

import com.github.raa0121.kokoroio.model.ProfileEntity

/**
 * 
 * @param id メンバーシップID
 * @param authority 権限
 * @param disable_notification 通知をオフにしているか（deprecated: use \"notification_policy\" instead.）
 * @param notification_policy 通知ポリシー
 * @param read_state_tracking_policy 未読メッセージ表示ポリシー
 * @param latest_read_message_id 一番新しい既読メッセージ
 * @param unread_count 未読数（WIP）
 * @param visible チャット画面のチャンネル一覧ペインに表示する
 * @param muted チャット画面のチャンネル一覧ペインにて未読数表示をオフにし、表示を薄くする
 * @param profile プロフィール情報
 */
data class MembershipWithoutChannelEntity (
    /* メンバーシップID */
    val id: kotlin.String? = null,
    /* 権限 */
    val authority: MembershipWithoutChannelEntity.Authority? = null,
    /* 通知をオフにしているか（deprecated: use \"notification_policy\" instead.） */
    val disable_notification: kotlin.Boolean? = null,
    /* 通知ポリシー */
    val notification_policy: MembershipWithoutChannelEntity.NotificationPolicy? = null,
    /* 未読メッセージ表示ポリシー */
    val read_state_tracking_policy: MembershipWithoutChannelEntity.ReadStateTrackingPolicy? = null,
    /* 一番新しい既読メッセージ */
    val latest_read_message_id: kotlin.Int? = null,
    /* 未読数（WIP） */
    val unread_count: kotlin.Int? = null,
    /* チャット画面のチャンネル一覧ペインに表示する */
    val visible: kotlin.Boolean? = null,
    /* チャット画面のチャンネル一覧ペインにて未読数表示をオフにし、表示を薄くする */
    val muted: kotlin.Boolean? = null,
    /* プロフィール情報 */
    val profile: ProfileEntity? = null
) {

    /**
    * 権限
    * Values: administrator,maintainer,member,invited
    */
    enum class Authority(val value: kotlin.Any){
    
        administrator("administrator"),
    
        maintainer("maintainer"),
    
        member("member"),
    
        invited("invited");
    
    }

    /**
     * 通知ポリシー
     * Values: allMessages,onlyMentions,nothing
     */
    enum class NotificationPolicy{ all_messages, only_mentions, nothing; }

    /**
     * 未読メッセージ表示ポリシー
     * Values: keepLatest,consumeLast,consumeLatest
     */
    enum class ReadStateTrackingPolicy { keep_latest, consume_last, consume_latest; }

}

