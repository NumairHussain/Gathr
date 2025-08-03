# Gathr App

An app for iOS and Android that allows people to create and/or join groups (One-time or ongoing), initiate gatherings at a recurring location for the group or a one-time location - such as houses, parks, restaurants, etc - and coordinate whos coming and with who at what time.

Gathr is built using Kotlin Multiplatform Mobile (KMM) to share business logic between iOS and Android, while maintaining fully native UIs using SwiftUI on iOS and Jetpack Compose on Android.

## Core Features

- Create and join groups (one-time or ongoing)
- Initiate real-life hangouts at homes, parks, or public spots
- Send push notifications and get RSVP responses
- Coordinate transportation (carpooling)
- Save hangout spots for reuse
- Track group history — who came, who rode with who, when, and where
- In-group chat for each hangout

## Features Checklist

### Core Features

- [ ] Create groups (one-time or ongoing)
- [ ] Join existing groups
- [ ] Settings for push notifications, display name, etc

### Groups Features

- [ ] Initiate hangouts in groups
- [ ] Save / suggest new locations from hangouts
- [ ] Member roles & permissions (e.g., moderators)
- [ ] Group descriptions, name, and emoji/icon
- [ ] Map integration for precise meeting points, apple maps for iOS, google maps for android

### Gathering Features

- [ ] RSVP system
- [ ] Notifications when hangout is created, and last call before hangout starts
- [ ] Ride sharing coordination (offer/need rides)

### Group History Features

- [ ] Track past hangouts per group
- [ ] Display hangout date, time, and location
- [ ] Show list of attendees (RSVP "yes")
- [ ] Show who rode with who (ride groups)

## Tech Stack

- **Kotlin Multiplatform Mobile (KMM)** — Shared logic for iOS and Android
- **Jetpack Compose** — UI for Android
- **SwiftUI** — UI for iOS
- **Firebase Realtime Database** — Stores hangouts, groups, RSVPs, chat, and ride info
- **Firebase Authentication** — User login and identity
- **Firebase Cloud Messaging (FCM)** — Push notifications
- **Firebase Storage** (optional future) — Image sharing & uploads

# Contributing

Contributions are welcome! I am only one person and I am inexperienced at that, so any help is appreciated. Please open an issue or submit a pull request if you have ideas or improvements.
