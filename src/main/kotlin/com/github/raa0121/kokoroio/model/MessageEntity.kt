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

import com.github.raa0121.kokoroio.model.AvatarEntity
import com.github.raa0121.kokoroio.model.ChannelEntity
import com.github.raa0121.kokoroio.model.EmbedContentEntity
import com.github.raa0121.kokoroio.model.ProfileEntity

/**
 * Creates a new message.
 * @param id メッセージID
 * @param idempotent_key 冪等性ID(Version 4 UUID)
 * @param display_name 発言時の表示名
 * @param avatar 発言時のアバターURL
 * @param expand_embed_contents URLが表すコンテンツを展開するかどうか
 * @param avatars 
 * @param status 発言の状態
 * @param content 発言内容(Deprecated. Use 'html_content' property instead of this.)
 * @param html_content 発言内容
 * @param plaintext_content プレインテキスト形式に変換した発言内容
 * @param raw_content 発言内容（プレインテキスト）
 * @param embedded_urls 埋め込みURL
 * @param embed_contents 埋め込みコンテンツ
 * @param published_at 発言日時
 * @param nsfw NSFW(Not suitable for work)かどうか
 * @param channel 発言があったチャンネル
 * @param profile 発言者情報
 */
data class MessageEntity (
    /* メッセージID */
    val id: kotlin.Int? = null,
    /* 冪等性ID(Version 4 UUID) */
    val idempotent_key: kotlin.String? = null,
    /* 発言時の表示名 */
    val display_name: kotlin.String? = null,
    /* 発言時のアバターURL */
    val avatar: kotlin.String? = null,
    /* URLが表すコンテンツを展開するかどうか */
    val expand_embed_contents: kotlin.Boolean? = null,
    /*  */
    val avatars: kotlin.Array<AvatarEntity>? = null,
    /* 発言の状態 */
    val status: MessageEntity.Status? = null,
    /* 発言内容(Deprecated. Use 'html_content' property instead of this.) */
    val content: kotlin.String? = null,
    /* 発言内容 */
    val html_content: kotlin.String? = null,
    /* プレインテキスト形式に変換した発言内容 */
    val plaintext_content: kotlin.String? = null,
    /* 発言内容（プレインテキスト） */
    val raw_content: kotlin.String? = null,
    /* 埋め込みURL */
    val embedded_urls: kotlin.Array<kotlin.String>? = null,
    /* 埋め込みコンテンツ */
    val embed_contents: kotlin.Array<EmbedContentEntity>? = null,
    /* 発言日時 */
    val published_at: java.time.LocalDateTime? = null,
    /* NSFW(Not suitable for work)かどうか */
    val nsfw: kotlin.Boolean? = null,
    /* 発言があったチャンネル */
    val channel: ChannelEntity? = null,
    /* 発言者情報 */
    val profile: ProfileEntity? = null
) {

    /**
    * 発言の状態
    * Values: active,deletedByPublisher,deletedByAnotherMember
    */
    enum class Status(val value: kotlin.Any){
    
        active("active"),
    
        deletedByPublisher("deleted_by_publisher"),
    
        deletedByAnotherMember("deleted_by_another_member");
    
    }

}

